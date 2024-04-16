package com.vijay.practise;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class RestAssuredtest {
	
	@Test
	public void ReadjsonresponsebodyTest() {
		
		/*RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		String Responsebody = response.getBody().asString();
		System.out.println(Responsebody);*/
		
		given()
		   .when()
		      .get("https://demoqa.com/BookStore/v1/Books")
		    .then()
		       .log().body();
	}
	
	@Test
	
	public void ReadjsonresponseasasstringandvalidateTest() {
		
		/*RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		String Responsebody = response.getBody().asString();
		Assert.assertTrue( Responsebody.contains("Git Pocket Guide"));
		Assert.assertTrue( Responsebody.contains("9781449325862"));*/
	
		String Responsebody = given()
				                .when()
				                   .get("https://demoqa.com/BookStore/v1/Books")
				                   .getBody().asString();
		Assert.assertTrue( Responsebody.contains("Git Pocket Guide"));
		Assert.assertTrue( Responsebody.contains("9781449325862"));
		
		
	}
	@Test
	
	public void Readjsonresponseandvalidatedata() {
		
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		JsonPath jsonpath = response.jsonPath();
		
		String isbn = jsonpath.getString("isbn");
		String title = jsonpath.getString("title");
		
		System.out.println("isbn:" + isbn );
		System.out.println("title:" + title );
	}
}
