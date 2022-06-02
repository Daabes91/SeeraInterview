package pojo;

import java.util.ArrayList;

public class SearchHotel {
	private String checkIn;
	private String checkOut;
	private String placeId;
	private ArrayList<RoomInfo> roomInfo;
	
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public ArrayList<RoomInfo> getRoomsInfo() {
		return roomInfo;
	}
	public void setRoomsInfo(ArrayList<RoomInfo> roomsInf) {
		this.roomInfo = roomsInf;
	}
	
	

}
