package resources;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import pojo.RoomInfo;
import pojo.SearchHotel;

public class TestDataBuilds {
	
	public SearchHotel searchHotelPayloud(String checkIn, String checkOut, String adults, String childs, String placeId)
	{
		SearchHotel payloud = new SearchHotel();
		//RoomInfo room = new RoomInfo();
		
		if(checkIn==""&& checkOut == "") {
		
		Random randomDays = new Random();
        LocalDate checkInRan = LocalDate.now().plusDays(randomDays.nextInt(30) + 1);
        LocalDate checkOutRan = checkInRan.plusDays(randomDays.nextInt(3) + 1);
        payloud.setCheckIn(checkInRan.toString());
		payloud.setCheckOut(checkOutRan.toString());
		}
		else {
			  payloud.setCheckIn(checkIn);
				payloud.setCheckOut(checkOut);
			
		}
        
		
		payloud.setPlaceId(placeId);
		ArrayList<RoomInfo> room= new ArrayList<RoomInfo>();
		  RoomInfo objRoom = new RoomInfo();
		
		int a = Integer.parseInt(adults);
		objRoom.setAdultsCount(a);
		
		
		
		if (childs!="")
		
		{
				List<String> arrayList = new ArrayList<String>    (Arrays.asList(childs.split(",")));
				ArrayList<Integer> ageList = new ArrayList<Integer>();
				for(String age:arrayList){
				    ageList.add(Integer.parseInt(age.trim()));
				}
		objRoom.setKidsAges(ageList);
		
		}
		
		room.add(objRoom);
		payloud.setRoomsInfo(room);
		System.out.println(objRoom.getAdultsCount());

		System.out.println(objRoom.getKidsAges());

		
		return payloud;
	}

	
	
}
