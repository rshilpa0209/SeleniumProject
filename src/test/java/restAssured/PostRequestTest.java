package restAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.*;
public class PostRequestTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://api.example.com";
    }

    @Test
    public void createPostWithAllComponents() {
        // Request Body
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "RestAssured TestNG Example");
        requestBody.put("content", "This is a POST test with all components.");

        // Send Request
        Response response = given()
                .log().all()
                .auth().basic("username", "password")  // Basic Auth
                .pathParam("userId", 123)              // Path Param
                .queryParam("notify", "true")          // Query Param
                .header("Content-Type", "application/json") // Header
                .body(requestBody.toJSONString())      // Body
                .when()
                .post("/users/{userId}/posts")         // Endpoint with path param
                .then()
                .log().all()
                .statusCode(201)                       // Validate status code
                .body("message", equalTo("Post created successfully"))  // Validate response field
                .extract().response();

        // Optional: Print or assert more
        System.out.println("Post ID: " + response.jsonPath().get("id"));
    }
}
