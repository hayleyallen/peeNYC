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
		
	public BathroomEntry(String entryName, double entryRating, String entryNotes, String entryAddress) {
		name = entryName;
		rating = entryRating;
		notes = entryNotes;
		address = entryAddress;
	}
	
	public BathroomEntry(String entryName, String entryAddress) {
		name = entryName;
		address = entryAddress;
	}
	
	public BathroomEntry(String entryName, double entryRating, String entryAddress) {
		name = entryName;
		rating = entryRating;
		address = entryAddress;
	}
	
	public BathroomEntry(String entryName, String entryNotes, String entryAddress) {
		name = entryName;
		notes = entryNotes;
		address = entryAddress;
	}
	
	public BathroomEntry(String entryName, boolean entryCodeStatus, String entryAddress) {
		name = entryName;
		codeStatus = entryCodeStatus;
		address = entryAddress;
	}
		
	//display info
	public void printBathroomEntry() {
		System.out.println("Name: " + getName());
		System.out.println("Location: " + getAddress());
		System.out.println("Rating: " + getRating());
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

}
