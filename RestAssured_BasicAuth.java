package API_test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssured_BasicAuth {

	public static void main(String[] args) {
	String basicAuthHeader = "Basic cG9zdG1hbjpwYXNzd29yZA==";
	String url = "https://postman-echo.com/basic-auth";
	
	given().header("authorization",basicAuthHeader).
	when().get(url).then().log().all().statusCode(200).and().body("authenticated", is(true));

	}

}
