package restAssured.pojoClassExample;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;



import java.util.Arrays;

public class CreateUserTest {

    public static void main(String[] args){
        Address address = new Address("123 Main St", "Bangalore", "560001");

        UserProfile user = new UserProfile("Alice",
                "alice@example.com",
                address,
                Arrays.asList("Java", "Selenium", "RestAssured"));

        baseURI = "https://reqres.in";


        given()
                .header("Content-Type", "application/json")
                .body(user)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .log().all();

    }

}
