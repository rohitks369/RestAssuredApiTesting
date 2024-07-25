package crud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PatchMethod {
	@Test
	public void test() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Rohit Kumar Singh");
		jsonObject.put("Job", "QA Tester");
		
		RestAssured.baseURI = "https://reqres.in/api/users/826";
		RestAssured.given().header("Content-type", "application/json")
		.contentType(ContentType.JSON)
		.body(jsonObject.toJSONString())
		.when()
		.patch()
		.then()
		.log().all()
		.statusCode(200);
	}
}
