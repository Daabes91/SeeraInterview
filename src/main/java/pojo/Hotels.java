package pojo;

public class Hotels {
	 private int hotelId;
	  private String name;
	  private String city;
	  private String country;
	  private String countryCode;
	  private String thumbnail_url;
	  private String displayType;
	  private double latitude;
	  private double longitude;
	  private boolean isActive;


	 // Getter Methods 

	  public int getHotelId() {
	    return hotelId;
	  }

	  public String getName() {
	    return name;
	  }

	  public String getCity() {
	    return city;
	  }

	  public String getCountry() {
	    return country;
	  }

	  public String getCountryCode() {
	    return countryCode;
	  }

	  public String getThumbnail_url() {
	    return thumbnail_url;
	  }

	  public String getDisplayType() {
	    return displayType;
	  }

	  public double getLatitude() {
	    return latitude;
	  }

	  public double getLongitude() {
	    return longitude;
	  }

	  public boolean getIsActive() {
	    return isActive;
	  }

	 // Setter Methods 

	  public void setHotelId( int hotelId ) {
	    this.hotelId = hotelId;
	  }

	  public void setName( String name ) {
	    this.name = name;
	  }

	  public void setCity( String city ) {
	    this.city = city;
	  }

	  public void setCountry( String country ) {
	    this.country = country;
	  }

	  public void setCountryCode( String countryCode ) {
	    this.countryCode = countryCode;
	  }

	  public void setThumbnail_url( String thumbnail_url ) {
	    this.thumbnail_url = thumbnail_url;
	  }

	  public void setDisplayType( String displayType ) {
	    this.displayType = displayType;
	  }

	  public void setLatitude( double latitude ) {
	    this.latitude = latitude;
	  }

	  public void setLongitude( double longitude ) {
	    this.longitude = longitude;
	  }

	  public void setIsActive( boolean isActive ) {
	    this.isActive = isActive;
	  }
	}


