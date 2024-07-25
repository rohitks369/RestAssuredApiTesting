package crud;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Test_DeleteMethod {

	@Test
	public void test() {
		RestAssured.baseURI = "https://reqres.in/api/users/826";
		RestAssured.given()
		.when()
		.delete()
		.then()
		.log().all()
		.statusCode(204);
	}
}
