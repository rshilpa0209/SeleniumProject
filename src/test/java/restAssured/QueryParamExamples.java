package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class QueryParamExamples {

    public void queryParamGetRequest(){
        // https://api.example.com/users?role=admin&active=true
        baseURI = "https://api.example.com";

        given()
                .queryParam("role", "admin")
                .queryParam("active", "true")
                .when()
                .get("/users")
                .then()
                .statusCode(200);
    }

    public void queryParamsWithMap(){
        // https://api.example.com/users?role=admin&active=true
        baseURI = "https://api.example.com";

        Map<String, String> params = new HashMap<>();
        params.put("role", "admin");
        params.put("active", "true");

        given()
                .queryParams(params)
                .when()
                .get("/users")
                .then()
                .statusCode(200);
    }

    public void queryParamPostRequest(){
        // https://api.example.com/orders?notify=true
        baseURI = "https://api.example.com";

        JSONObject requestBody = new JSONObject();
        requestBody.put("productId", 101);
        requestBody.put("quantity", 2);

        given()
                .queryParam("notify", "true")
                .body(requestBody.toJSONString())
                .when()
                .post("/orders")
                .then()
                .statusCode(201);
    }
}
