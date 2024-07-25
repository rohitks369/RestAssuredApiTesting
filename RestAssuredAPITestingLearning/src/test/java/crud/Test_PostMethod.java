package crud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PostMethod {

	@Test
	public void test01() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Rohit");
		jsonObject.put("Job", "Testing");

		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().header("Content-type", "application/json")
		.contentType(ContentType.JSON)
		.body(jsonObject.toJSONString())
		.when()
		.post()
		.then()
		.log().all()
		.statusCode(201);
	}
}
