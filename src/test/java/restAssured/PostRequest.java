package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

public class PostRequest {

    @Test
    public void postTest1() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "John");
        map.put("job", "Teacher");
        System.out.println(map);

        JSONObject request = new JSONObject(map);
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in";
        given()
                .body(request.toJSONString())
        .when()
                .post("/api/users")
        .then()
                .statusCode(201)
                .log().all();
    }

    @Test
    public void postTest2() {
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
                .post("/api/users")
        .then()
                .statusCode(201)
                .log().all();
    }

}
