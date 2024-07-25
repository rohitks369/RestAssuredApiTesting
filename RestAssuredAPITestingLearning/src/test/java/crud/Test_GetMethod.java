package crud;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Test_GetMethod {
	@Test
	public void test01() {
    //	Get Request - https://reqres.in/api/users?page=2
    //	Print response code, response body, response header, response time
		Response response= get("https://reqres.in/api/users?page=2");
		System.out.println("Response code : "+response.getStatusCode());
		System.out.println("Response body : "+response.getBody().asPrettyString());
		System.out.println("Response header : "+response.getHeader("Content-Type"));
		System.out.println("Response Time : "+response.getTime());
		
		
		//validate status code
		//expected status code =200
		int expectedStatusCode=200;
		int statusCode=response.getStatusCode();
		Assert.assertEquals(expectedStatusCode, statusCode);
		
	}
	
	//BBD format
	@Test
	public void Test02() {
		//given, when, then
		baseURI="https://reqres.in/api/users";
		given().param("page","2") //name, value
		.when().get().then().statusCode(200);
		
	}
}
