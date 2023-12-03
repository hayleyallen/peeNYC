public class BathroomEntry {

	//data fields
	private String name;
	private double rating;
	private String notes;
	private String address;
	private boolean codeStatus;
		
		
	//default constructor
	public BathroomEntry() {
	}
		
    //constructor: all fields
	public BathroomEntry(String entryName, double entryRating, String entryNotes, String entryAddress, boolean entryCodeStatus) {
		name = entryName;
		rating = entryRating;
		notes = entryNotes;
		address = entryAddress;
        codeStatus = entryCodeStatus;
	}
	
    //constructor: name, address
	public BathroomEntry(String entryName, String entryAddress) {
		name = entryName;
		address = entryAddress;
	}
	//constructor: name, address, rating
	public BathroomEntry(String entryName, double entryRating, String entryAddress) {
		name = entryName;
		rating = entryRating;
		address = entryAddress;
	}

	//constructor: name, address, notes
	public BathroomEntry(String entryName, String entryNotes, String entryAddress) {
		name = entryName;
		notes = entryNotes;
		address = entryAddress;
	}
	//constructor: name, address, code status
	public BathroomEntry(String entryName, boolean entryCodeStatus, String entryAddress) {
		name = entryName;
		codeStatus = entryCodeStatus;
		address = entryAddress;
	}

    //constructor: name, address, rating, notes
    public BathroomEntry(String entryName, double entryRating, String entryNotes, String entryAddress) {
		name = entryName;
		rating = entryRating;
        notes = entryNotes;
		address = entryAddress;
	}

    //constructor: name, address, rating, code status
    public BathroomEntry(String entryName, double entryRating, boolean entryCodeStatus, String entryAddress) {
		name = entryName;
		rating = entryRating;
        codeStatus = entryCodeStatus;
		address = entryAddress;
	}

    //constructor: name, address, notes, code status
	public BathroomEntry(String entryName, String entryNotes, boolean entryCodeStatus, String entryAddress) {
		name = entryName;
		codeStatus = entryCodeStatus;
        notes = entryNotes;
		address = entryAddress;
	}

	//display info
	public void printBathroomEntry() {
		System.out.println("Name: " + getName());
		System.out.println("Location: " + getAddress());
		System.out.println("Rating: " + getRating());
        System.out.println("Code status: " + getCodeStatus());
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

}
