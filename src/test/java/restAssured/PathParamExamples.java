package restAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PathParamExamples {

    public void basicExample(){
        // https://api.example.com/users/123

        baseURI = "https://api.example.com";
        given()
                .pathParam("userId", 123)
                .when()
                .get("/users/{userId}")
                .then()
                .statusCode(200);
    }

    public void multiplePathParam(){
        // https://api.example.com/users/{userId}/orders/{orderId}

        baseURI = "https://api.example.com";
        given()
                .pathParam("userId", 123)
                .pathParam("orderId", 789)
                .when()
                .get("/users/{userId}/orders/{orderId}")
                .then()
                .statusCode(200)
                .body("order.id", equalTo(789));
    }


}
