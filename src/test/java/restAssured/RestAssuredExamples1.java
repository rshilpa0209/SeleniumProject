package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredExamples1 {

    @Test
    public void getRequestExample(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Status code is: " + response.getStatusCode());
        System.out.println("Total time consumed: " + response.getTime());
        System.out.println("Response body is: " + response.getBody().asString());
        System.out.println("Status line: " + response.getStatusLine());
        System.out.println("Content-Type: " + response.getHeader("content-type"));

        int status_code = response.getStatusCode();
        Assert.assertEquals(status_code, 200);
    }
}
