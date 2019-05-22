package com.mvnPrjt;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewTest {
  @Test
  public void f() {
//	  RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
//	  
//	  RequestSpecification httpRequest = RestAssured.given();
//	  
//	  Response response = httpRequest.request(Method.GET, "/Hyderabad");
//	  
//	  String responseBody = response.getHeaders().toString();
//	  System.out.println("Response Body is =>  " + responseBody);
	  
	  RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
	  PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
	  authScheme.setUserName("ToolsQA");
	  authScheme.setPassword("TestPassword");
	  RestAssured.authentication = authScheme;
	  
	  RequestSpecification request = RestAssured.given();
	  
	  Response response = request.get();
	  System.out.println("Status code: " + response.getStatusCode());
	  System.out.println("Status message " + response.body().asString());
	  
  }
}
