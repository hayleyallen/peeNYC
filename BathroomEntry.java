public class BathroomEntry {

	// data fields
	private String name;
	private double rating;
	private String address;
	private long latitude;
	private long longitude;
	private int codeStatus;
	private boolean accessibility;

	// default constructor
	public BathroomEntry() {
	}

	// constructor: all fields
	public BathroomEntry(String entryName, double entryRating, String entryAddress,
			long entryLatitude, long entryLongitude, int entryCodeStatus, boolean entryAccessibility) {
		this.name = entryName;
		this.rating = entryRating;
		this.address = entryAddress;
		this.latitude = entryLatitude;
		this.longitude = entryLongitude;
		this.codeStatus = entryCodeStatus;
		this.accessibility = entryAccessibility;
	}

	// constructor: name, address, code status, accessibility
	public BathroomEntry(String entryName, String entryAddress, long entryLatitude, long entryLongitude,
			int entryCodeStatus, boolean entryAccessibility) {
		name = entryName;
		address = entryAddress;
		latitude = entryLatitude;
		longitude = entryLongitude;
		codeStatus = entryCodeStatus;
		accessibility = entryAccessibility;
	}

	// constructor: name, address, code status, accessibility, rating
	public BathroomEntry(String entryName, String entryAddress, int entryCodeStatus, boolean entryAccessibility,
			double entryRating) {
		name = entryName;
		address = entryAddress;
		codeStatus = entryCodeStatus;
		accessibility = entryAccessibility;
		rating = entryRating;
	}

	// display info
	public void printBathroomEntry() {
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		System.out.println("Coordinates (latitude, longitude): " + getLatitude() + ", " + getLongitude());
		System.out.println("Rating: " + getRating());
		System.out.println("Code status: " + getCodeStatus());
		System.out.println("ADA compliance: " + getAccessibility());
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public int getCodeStatus() {
		return codeStatus;
	}

	public void setCodeStatus(int codeStatus) {
		this.codeStatus = codeStatus;
	}

	public boolean getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(boolean accessibility) {
		this.accessibility = accessibility;
	}

}
