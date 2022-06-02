package pojo;

import java.util.ArrayList;

public class SearchPlace {
	  private ArrayList<Hotels> hotels = new ArrayList<Hotels>();
	  private ArrayList<Locations> locations = new ArrayList<Locations>();

	  public ArrayList<Hotels> getHotels() {
			return hotels;
		}
	  public void setHotels(ArrayList<Hotels> hotels) {
			this.hotels = hotels;
		}
	  public ArrayList<Locations> getLocations() {
				return locations;
			}
	  public void setLocations(ArrayList<Locations> locations) {
				this.locations = locations;
			
}
}
