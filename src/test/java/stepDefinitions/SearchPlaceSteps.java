package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuilds;
import resources.Utils;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class SearchPlaceSteps extends Utils {
	RequestSpecification res;

			ResponseSpecification respo;
			Response response;
			TestDataBuilds data = new TestDataBuilds();
			@Given("User Search for place by {string}")
			public void user_search_for_place_by(String name) throws IOException {
				
				res = given().spec(requestSpecification())
						.queryParam("query", name);
				 
			
				  
				
			    
			}

			@When("API resource is {string} and Http Method is {string}")
			public void api_resource_is_and_http_method_is(String recource, String method) {
			   APIResources resoucreAPI = APIResources.valueOf(recource);
			
			   respo = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
			   
			 //  if(method.equalsIgnoreCase("get")) {
			   response = res.when().get(resoucreAPI.getResource()).then().spec(respo).extract().response();
			//   }
			 //  else if (method.equalsIgnoreCase("post")) {
				//   response = res.when().post(resoucreAPI.getResource()).then().spec(respo).extract().response();
				   
			 //  }
			   
			  
			}
			@Then("Response status code should be {int}")
			public void response_status_code_should_be(int code) {
				assertEquals(response.getStatusCode(), code );
			 
			    
			}
		}


