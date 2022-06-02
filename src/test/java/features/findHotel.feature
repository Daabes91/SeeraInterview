Feature: Validate Search Hotels API.
	
	#Globel bug that user is able to Post the request with sending roomInf Object instead of roominfo Objeckt 
	# Note that roomInf object does not have any validation

	
	Scenario Outline: Verify that sId is returning when user provide valid data
		Given User  Search for a Hotel where checkIn date is "<checkInDate>" and checkOut date is "<checkOutDate>" and adults number is "<numberOfAdults>" and childs ages is "<childsAges>" and placeId is "<placeId>"
		When API resource is "FindHotel" and Https Method is "Post" 
		Then Response status code equals 200
		Then Response body should  contains "sId" property
		Examples:
		|checkInDate|checkOutDate|numberOfAdults|childsAges|placeId|
		|2022-06-15|2022-06-25|2|1,10,4|ChIJawhoAASnyhQR0LABvJj-zOE|
		
		
		Scenario Outline: Verify Api is working successfully with random checkin and checkout dates
		Given User  Search for a Hotel where checkIn date is "<checkInDate>" and checkOut date is "<checkOutDate>" and adults number is "<numberOfAdults>" and childs ages is "<childsAges>" and placeId is "<placeId>"
		When API resource is "FindHotel" and Https Method is "Post" 
		Then Response status code equals 200
		Then Response body should  contains "sId" property
		Examples:
		|checkInDate|checkOutDate|numberOfAdults|childsAges|placeId|
		|||2||ChIJawhoAASnyhQR0LABvJj-zOE|
		
		Scenario Outline: Verify that api is throwing 400 if checkout date before checkin date 
		Given User  Search for a Hotel where checkIn date is "<checkInDate>" and checkOut date is "<checkOutDate>" and adults number is "<numberOfAdults>" and childs ages is "<childsAges>" and placeId is "<placeId>"
		When API resource is "FindHotel" and Https Method is "Post" 
		Then Response status code equals 400
		Examples:
		|checkInDate|checkOutDate|numberOfAdults|childsAges|placeId|
		|2022-06-15|2022-06-14|2|4,5,1,3|ChIJawhoAASnyhQR0LABvJj-zOE|
		
		Scenario Outline: Verify that api is throwing 400 if checkin date or/and checkout is in the past 
		Given User  Search for a Hotel where checkIn date is "<checkInDate>" and checkOut date is "<checkOutDate>" and adults number is "<numberOfAdults>" and childs ages is "<childsAges>" and placeId is "<placeId>"
		When API resource is "FindHotel" and Https Method is "Post" 
		Then Response status code equals 400
		Examples:
		|checkInDate|checkOutDate|numberOfAdults|childsAges|placeId|
		|2022-05-15|2022-06-14|2|4,5,1,3|ChIJawhoAASnyhQR0LABvJj-zOE|
		|2022-05-15|2022-05-16|2|4,5,1,3|ChIJawhoAASnyhQR0LABvJj-zOE|
		

		Scenario Outline: Verify that api throwing if there is more than 30 days between checkin date and checkout date
		Given User  Search for a Hotel where checkIn date is "<checkInDate>" and checkOut date is "<checkOutDate>" and adults number is "<numberOfAdults>" and childs ages is "<childsAges>" and placeId is "<placeId>"
		When API resource is "FindHotel" and Https Method is "Post" 
		Then Response status code equals 400
		Examples:
		|checkInDate|checkOutDate|numberOfAdults|childsAges|placeId|
		|2022-07-01|2022-07-31|2|4,5,1,3|ChIJawhoAASnyhQR0LABvJj-zOE|
		
		
		Scenario Outline: Verify that child ages is not required and sId is returning 
		Given User  Search for a Hotel where checkIn date is "<checkInDate>" and checkOut date is "<checkOutDate>" and adults number is "<numberOfAdults>" and childs ages is "<childsAges>" and placeId is "<placeId>"
		When API resource is "FindHotel" and Https Method is "Post" 
		Then Response status code equals 200
		Then Response body should  contains "sId" property
		Examples:
		|checkInDate|checkOutDate|numberOfAdults|childsAges|placeId|
		|2022-06-15|2022-06-25|2||ChIJawhoAASnyhQR0LABvJj-zOE|
		
			
		
		# Note that there is a bug if user Sent roomInf OBJECT instead of roomInfo its working successfully 
		Scenario Outline: Verify that if Adults + childs.size() is more than 8 API is throwing 400 
		Given User  Search for a Hotel where checkIn date is "<checkInDate>" and checkOut date is "<checkOutDate>" and adults number is "<numberOfAdults>" and childs ages is "<childsAges>" and placeId is "<placeId>"
		When API resource is "FindHotel" and Https Method is "Post" 
		Then Response status code equals 400
		Examples:
		|checkInDate|checkOutDate|numberOfAdults|childsAges|placeId|
		|2022-06-15|2022-06-25|2|3,4,2,11,4,5,1,3|ChIJawhoAASnyhQR0LABvJj-zOE|
		
		
		
			Scenario Outline: Verify that API is throwing 400 if any child age is more that 11
		Given User  Search for a Hotel where checkIn date is "<checkInDate>" and checkOut date is "<checkOutDate>" and adults number is "<numberOfAdults>" and childs ages is "<childsAges>" and placeId is "<placeId>"
		When API resource is "FindHotel" and Https Method is "Post" 
		Then Response status code equals 400
		Examples:
		|checkInDate|checkOutDate|numberOfAdults|childsAges|placeId|
		|2022-06-15|2022-06-25|2|3,4,2,12|ChIJawhoAASnyhQR0LABvJj-zOE|
		
		
	
		