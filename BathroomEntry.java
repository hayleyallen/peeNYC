public class BathroomEntry {

	//data fields
	private String name;
	private double rating;
	private String notes;
	private String address;
	private boolean codeStatus;
    private boolean accessibility;
		
		
	//default constructor
	public BathroomEntry() {
	}
		
    //constructor: all fields
	public BathroomEntry(String entryName, double entryRating, String entryNotes, String entryAddress, boolean entryCodeStatus, boolean entryAccessibility) {
		name = entryName;
		rating = entryRating;
		notes = entryNotes;
		address = entryAddress;
        codeStatus = entryCodeStatus;
        accessibility = entryAccessibility;
	}
	
    //constructor: name, address, code status, accessibility
	public BathroomEntry(String entryName, String entryAddress, boolean entryCodeStatus, boolean entryAccessibility) {
		name = entryName;
		address = entryAddress;
        codeStatus = entryCodeStatus;
        accessibility = entryAccessibility;
	}

    //constructor: name, address, code status, accessibility, rating
	public BathroomEntry(String entryName, String entryAddress, boolean entryCodeStatus, boolean entryAccessibility, double entryRating) {
		name = entryName;
		address = entryAddress;
        codeStatus = entryCodeStatus;
        accessibility = entryAccessibility;
        rating = entryRating;
	}

    //constructor: name, address, code status, accessibility, notes
	public BathroomEntry(String entryName, String entryAddress, boolean entryCodeStatus, boolean entryAccessibility, String entryNotes) {
		name = entryName;
		address = entryAddress;
        codeStatus = entryCodeStatus;
        accessibility = entryAccessibility;
        notes = entryNotes;
	}

	//display info
	public void printBathroomEntry() {
		System.out.println("Name: " + getName());
		System.out.println("Location: " + getAddress());
		System.out.println("Rating: " + getRating());
        System.out.println("Code status: " + getCodeStatus());
        System.out.println("ADA compliance: " + getAccessibility());
		System.out.println("Notes: " + getNotes());
	}

	//getters and setters
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    public boolean getCodeStatus() {
		return address;
	}

	public void setCodeStatus(boolean codeStatus) {
		this.codeStatus = codeStatus;
	}

     public boolean getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(boolean accessibility) {
		this.accessibility = accessibility;
	}

}
