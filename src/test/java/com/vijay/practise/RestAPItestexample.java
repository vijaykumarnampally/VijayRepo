package com.vijay.practise;

import org.testng.Assert;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.internal.http.Status;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class RestAPItestexample {

	@Test
	public void GetBooksDetails() {

		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "");

		System.out.println("Status received => " + response.getStatusLine());
		System.out.println("Response=>" + response.prettyPrint());

	}

	@Test

	public static void getResponseBody() {

		String baseURI = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

		RequestSpecification request = RestAssured.given();

		Response response = request.get(baseURI);

		System.out.println("Status received => " + response.body().asPrettyString());
		System.out.println("Response=>" + response.statusCode());
	}

	@Test
	public static void getResponse() {
	
		String baseURI = "http://demo.guru99.com/V4/sinkministatement.php";

		RequestSpecification request = RestAssured.given();
		
		Response response = request.get(baseURI);
		
		System.out.println("Status received => " + response.body().asPrettyString());
		System.out.println("Response=>" + response.statusCode());
	}
	
	@Test
	public void Restassured_Practice1() {
		
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("content type"));
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
				
	}
	
	@Test
	
	public void Restassured_Practice2() {
		
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asString());
	}
	
	@Test
	public void Restassured_practice3() {
		
		/*RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		Headers headers = response.headers();
		
		for (Header header :headers) {
			
			System.out.println(header.getName() +  "-->" + header.getValue() );*/
			
			given()
			   .when()
			      .get("https://dummy.restapiexample.com/api/v1/employees")
			   .then()
			      .log().headers();
			
			}
	
	@Test
	
	public void Restassured_practice4() {
		
		/*RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getHeader("content-length"));*/
		
		Response response = given()
				              .when()
				              .get("https://dummy.restapiexample.com/api/v1/employees");
		
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getHeader("content-length"));
		
	}
	@Test
	
	public void Restassured_practice5() {
		
		/*RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		String contenttype = response.getHeader("Content-type");
		String contentlength = response.getHeader("Content-Length");
		
		Assert.assertEquals(contenttype, "application/json");
		Assert.assertEquals(contentlength, "636");*/
		
		given()
        .when()
           .get("https://dummy.restapiexample.com/api/v1/employees")
        .then()
            .header("Content-type", "application/json")
            .header("Content-Length", "636");
		
	}
}

