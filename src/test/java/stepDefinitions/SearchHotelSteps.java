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
import static org.junit.Assert.*;

import java.io.IOException;


public class SearchHotelSteps extends Utils {
	RequestSpecification res;
	ResponseSpecification respo;
	Response response;
	TestDataBuilds data = new TestDataBuilds();

@Given("User  Search for a Hotel where checkIn date is {string} and checkOut date is {string} and adults number is {string} and childs ages is {string} and placeId is {string}")
public void user_search_for_a_hotel_where_check_in_date_is_and_check_out_date_is_and_adults_number_is_and_childs_ages_is_and_place_id_is(String checkIn, String checkOut, String adults, String childs, String placeId) throws IOException {
	res = given().spec(requestSpecification())
			.body(data.searchHotelPayloud(checkIn,checkOut,adults,childs,placeId));
	 

	  
}
@When("API resource is {string} and Https Method is {string}")
public void api_resource_is_and_https_method_is(String resource, String method) {
	 APIResources resoucreAPI = APIResources.valueOf(resource);
		
	   respo = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
	   response = res.when().post(resoucreAPI.getResource()).then().spec(respo).extract().response();

}
@Then("Response status code equals {int}")
public void response_status_code_equals(int code) {
    // Write code here that turns the phrase above into concrete actions
	assertEquals(response.getStatusCode(), code );
}
@Then("Response body should  contains {string} property")
public void response_body_should_contains_property(String property) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println();
    assertTrue(response.asString().contains(property));
}
}
