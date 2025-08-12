package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PutPatchDeleteRequests {

    @Test
    public void putTest() {
        JSONObject request = new JSONObject();
        request.put("name", "John");
        request.put("job", "Teacher");
        System.out.println(request.toJSONString());
        baseURI = "https://reqres.in";

        given()
                .header("Content-Type", "application/json")
                //.contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(request.toJSONString())
        .when()
                .put("api/users/2")
        .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void patchTest() {
        JSONObject request = new JSONObject();
        request.put("name", "John");
        request.put("job", "Teacher");
        System.out.println(request.toJSONString());
        baseURI = "https://reqres.in";

        given()
                .header("Content-Type", "application/json")
                //.contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(request.toJSONString())
        .when()
                .patch("api/users/2")
        .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void deleteTest() {
        baseURI = "https://reqres.in";

        when()
                .delete("api/users/2")
        .then()
                .statusCode(204)
                .log().all();
    }

}
