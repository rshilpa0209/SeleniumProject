package restAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequest {

    @Test
    public void getTest1(){
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println("Status code is: " + response.getStatusCode());
        System.out.println("Total time consumed: " + response.getTime());
        System.out.println("Response body is: " + response.getBody().asString());
        System.out.println("Status line: " + response.getStatusLine());
        System.out.println("Content-Type: " + response.getHeader("content-type"));

        int status_code = response.getStatusCode();
        Assert.assertEquals(status_code, 200);
    }

    @Test
    public void getTest2() {
        baseURI = "https://reqres.in";
        given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data[1].id", equalTo(8))
                .log().all();
    }

    @Test
    public void getTest3() {
        baseURI = "https://reqres.in";
        given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data[4].first_name", equalTo("George"))
                .body("data.first_name", hasItems("George", "Tobias"))
                .log().all();

    }

    @Test
    public void getTest4() {
        baseURI = "https://reqres.in";

        Response response = given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .extract().response();

        String first_name_4 = response.jsonPath().getString("data[4].first_name");
        System.out.println(first_name_4);
    }

}
