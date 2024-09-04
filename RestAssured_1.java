package API_test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class RestAssured_1 {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		
		
		given().when().get("posts/1").then().log().all().statusCode(200);
	}

}

