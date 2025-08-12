package restAssured;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class CompletePostRequest {

    public void completePostRequestExample(){

        // https://api.example.com/users/{userId}/posts?notify=true

        RestAssured.baseURI = "https://api.example.com";

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "RestAssured Guide");
        requestBody.put("content", "This is a full example with all components.");

        given()
                .pathParam("userId", 123)
                .queryParam("notify","true")
                .header("Content-Type", "application/json")
                .auth().basic("username", "password")
                .body(requestBody.toJSONString())
           .when()
                .post("/users/{userId}/posts")
           .then()
                .statusCode(201)
                .body("message", equalTo("Post created successfully"))
                .body("userId", equalTo(123));
    }
}
