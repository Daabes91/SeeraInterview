Feature: Validate Search Place API.
	

	
	Scenario Outline: Verify that Search  place is returns Locations and Hotels when data is valid.
		Given User Search for place by "<name>"
		When API resource is "FindPlace" and Http Method is "Get" 
		Then Response status code should be 200
		Examples:
		|name|
		|mo|
		
		
	Scenario Outline: Verify that Search  places API is throwing 400 if quer is empty 
		Given User Search for place by "<name>"
		When API resource is "FindPlace" and Http Method is "Get" 
		Then Response status code should be 400
	
		Examples:
		|name|
		||
		

		
