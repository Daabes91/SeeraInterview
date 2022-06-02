package pojo;

public class Locations {
	  private String name;
	  private String city;
	  private String country;
	  private String displayType;
	  private String placeId;
	  private String source;
	  private GoogleType GoogleTypeObject;


	 // Getter Methods 

	  public String getName() {
	    return name;
	  }

	  public String getCity() {
	    return city;
	  }

	  public String getCountry() {
	    return country;
	  }

	  public String getDisplayType() {
	    return displayType;
	  }

	  public String getPlaceId() {
	    return placeId;
	  }

	  public String getSource() {
	    return source;
	  }

	  public GoogleType getGoogleType() {
	    return GoogleTypeObject;
	  }

	 // Setter Methods 

	  public void setName( String name ) {
	    this.name = name;
	  }

	  public void setCity( String city ) {
	    this.city = city;
	  }

	  public void setCountry( String country ) {
	    this.country = country;
	  }

	  public void setDisplayType( String displayType ) {
	    this.displayType = displayType;
	  }

	  public void setPlaceId( String placeId ) {
	    this.placeId = placeId;
	  }

	  public void setSource( String source ) {
	    this.source = source;
	  }

	  public void setGoogleType( GoogleType googleTypeObject ) {
	    this.GoogleTypeObject = googleTypeObject;
	  }
	
}
