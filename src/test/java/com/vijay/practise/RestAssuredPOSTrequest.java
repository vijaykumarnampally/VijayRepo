package com.vijay.practise;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class RestAssuredPOSTrequest {
	
	@Test
	
	public void addproductusingJsonasstring() {
		
		String JsonrequestbodyasString = "{\"title\": \"Laptop\",\"price\": \"109.95\",\"description\": \"Best Electronic\",\"category\": \"Electronic\"}";
		
		/*RestAssured.baseURI = "https://fakestoreapi.com/products";
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(JsonrequestbodyasString);
		
		Response response = request.post();
		
		System.out.println(response.getBody().asPrettyString());*/
		
		given()
            .contentType(ContentType.JSON)
		    .body(JsonrequestbodyasString)
		.when()
		     .post("https://fakestoreapi.com/products")
		.then()
		    .log().body();
		
	}
	
	@Test
	
	public void addproductusingMap() {
		
		Map<String, String> JsonRequestAsBodyAsMap = new HashMap<>();
	    JsonRequestAsBodyAsMap.put("title", "Laptop");
	    JsonRequestAsBodyAsMap.put("price", "109.95");
	    JsonRequestAsBodyAsMap.put("description", "Best Electronic");
	    JsonRequestAsBodyAsMap.put("category", "Electronic");
	    
	   /* RestAssured.baseURI = "https://fakestoreapi.com/products";
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(JsonRequestAsBodyAsMap);
		
		Response response = request.post();
		
		System.out.println(response.getBody().asPrettyString());*/
		
		given()
		  .contentType(ContentType.JSON)
		  .body(JsonRequestAsBodyAsMap)
		.when()
		  .post("https://fakestoreapi.com/products")
		.then()
		  .log().body();
		  
	}
	@Test
	
	public void addproductusingJsonobject() {
		
		JSONObject JsonrequesttoBody = new JSONObject();
		JsonrequesttoBody.put("title", "Laptop");
		JsonrequesttoBody.put("price", "250");
		JsonrequesttoBody.put("description", "Best Electronic");
	    JsonrequesttoBody.put("category", "Electronic");
	    
	    /*RestAssured.baseURI = "https://fakestoreapi.com/products";
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(JsonrequesttoBody.toString());
		
		Response response = request.post();
		
		System.out.println(response.getBody().asPrettyString());*/
		
		given()
		  .contentType(ContentType.JSON)
		  .body(JsonrequesttoBody.toString())
		.when()
		  .post("https://fakestoreapi.com/products")
		.then()
		  .log().body();
		  
	}
	
}
