package resources;

import io.restassured.specification.RequestSpecification;

public enum APIResources {
	
	FindHotel("/enigma/search/async"),
	FindPlace("/enigma/autocomplete");
	private String resource;
	
	APIResources(String resource) {
		
		this.resource=resource;
		
	}

	
	public String getResource() {
		return resource;
	}
	

}
