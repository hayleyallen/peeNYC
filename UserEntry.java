import java.util.Scanner;

public class User {
	//data fields
	private String username;
	private String password;
	
	//constructor for username and password
	public User(String user, String pass) {
		this.username = user;
		this.password = pass;
	}
	
	//getters and setters
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//print username and password
	public void PrintUserInfo() {
		System.out.println("Username: "  + username);
		System.out.println("Password: " + password);
	}
}

//NORMAL USER
 class NormalUser extends User implements NormalInterface {
	 //data fields
	 private int id;
	 static Scanner input = new Scanner (System.in);
	 //create directory object
	 private PhoneBookDirectory y = new PhoneBookDirectory();
	 
	 //constructor using super
	 public NormalUser(String username, String password, int ID) {
			super(username, password);
			this.id = ID;
	 }
	 
	 //print info
	 public void PrintUserInfo() {
			System.out.println("Username: "  + super.getUsername());
			System.out.println("Password: " + super.getPassword());
			System.out.println("ID " +  id);
			System.out.println("Phone Book Directory");
			y.PrintAll();
	}
	 
	//call id method
	 public void SortId() {
		 y.SortId();
	 }
	
	 //call edit method
	 public int Edit(String first, String last) {
		 return y.Edit(first, last);
	 }
		
	 //call linear search method
	 public int LinearSearchByPhoneNumber(String phone) {
		 return y.LinearSearchByPhoneNumber(phone);
	 }

	 //call add method
	 public int addEntry(PhoneBookEntry entry) {
		 return y.addEntry(entry);
	 }
	
	 //menu
	 public void Menu() {
		 //declare variables
		 int choice;
		 String first;
	   	 String last;
		 int ID;
		 String emad;
		 int zip;
		 String phone;
		 
		 //enter do-while to continue menu functions unless user chooses to stop
		 do {
			 System.out.println("1. Add a phone entry");
			 System.out.println("2. Edit a phone entry of a with a given first name and last name");
			 System.out.println("3. Sort the PhoneBookDirectory");
			 System.out.println("4. Search using linear search");
			 System.out.println("5. Print user's info");
			 System.out.println("6. Exit");
			 //get choice from user
			 choice = input.nextInt();
			 
			 //if statements to execute appropriate functions
			 if (choice == 1) {
				 //options for adding an entry
				 System.out.println("Add an entry");
				 System.out.println("1. Use default settings");
				 System.out.println("2. Add the first name and phone number");
				 System.out.println("3. Add in all attributes");
				 int ch = input.nextInt();
				 
				 //get information from user and call add method
				 if (ch == 1) {
					 PhoneBookEntry holder = new PhoneBookEntry();
					 System.out.println(addEntry(holder));
				 } else if (ch == 2) {
					 System.out.print("Enter a first name: ");
					 first = input.next();
					 System.out.print("Enter a phone number: ");
					 last = input.next();
					 PhoneBookEntry holder = new PhoneBookEntry(first,last);
					 System.out.println(addEntry(holder));
				 } else if (ch == 3) {
					 System.out.print("Enter a first name: ");
				   	 first = input.next();
					 System.out.print("Enter a last name: ");
					 last = input.next();	
					 System.out.print("Enter an id: ");
					 ID = input.nextInt();
					 System.out.print("Enter the email address: ");
					 emad = input.next();
					 System.out.print("Enter the zipcode: ");
					 zip = input.nextInt();
					 System.out.print("Enter the phone number: ");
					 phone = input.next();
					 PhoneBookEntry holder = new PhoneBookEntry(ID, first,last,emad,zip,phone);
					 System.out.println(addEntry(holder));
				 } else {
					 System.out.println("Invalid choice");
				 }
			 //get editing info and call edit method
			 } else if (choice == 2) {
				 System.out.print("Enter a first name of the entry you want to edit: ");
				 first = input.next();
				 System.out.print("Enter a last name of the entry you want to edit: ");
				 last = input.next();
				 System.out.println(Edit(first, last));
			 //call sort method
			 } else if (choice == 3) {
				 SortId();
			 //get phone number from user and call sort method
			 } else if (choice == 4) {
				 System.out.print("Enter the phone number you want to search for: ");
				 phone = input.next();
				 System.out.println(LinearSearchByPhoneNumber(phone));
			 //call print method
			 } else if (choice == 5) {
				 PrintUserInfo();
			 } else if(choice <1 && choice > 6){
				 System.out.println("Invalid selection");
			 }
		 } while(choice != 6);
	 }
}
 
//ADMIN
class PhoneBookAdmin extends User implements AdminInterface {
	 //data fields
	 private String email;
	 static Scanner input = new Scanner (System.in);
	 //create new directory object
	 private PhoneBookDirectory y = new PhoneBookDirectory();
	 
	 //constructor with super
	 public PhoneBookAdmin(String username, String password, String email) {
		 super(username, password);
		 this.email = email;
	 }
		
	 //PrintUserInfo overridden
	 public void PrintUserInfo() {
		 System.out.println("Username: "  + super.getUsername());
		 System.out.println("Password: " + super.getPassword());
		 System.out.println("Email Address " +  email);
		 System.out.println("Phone Book Directory entries:");
		 System.out.println();
		 y.PrintAll();
	 }
		
	 //call sort method
	 public void SortId() {
		 y.SortId();
	 }
	
	 //call edit method with first and last and return appropriate number to confirm edits were made
	 public int Edit(String first, String last) {
		 int xy = y.Edit(first, last);
		 if (xy == 1) {
			 return 1;
		 } else {
			 return 0;
		 }
	 }
		
	 //call delete method with id and return appropriate number to confirm deletion
	 public int DeleteEntry(int id) {
		 int xy = y.DeleteEntry(id);
		 if (xy == 1) {
		 	return 1;
		 } else {
			return 0;
		 }
	 }
		
	//call linear search method with phone number
	 public int LinearSearchByPhoneNumber(String phone) {
		 return y.LinearSearchByPhoneNumber(phone);
	 }
		
	 ////call add method and return appropriate number to confirm addition of entry
	 public int addEntry(PhoneBookEntry entry) {
		 int xy = y.addEntry(entry);
		 if (xy == 1) {
			 return 1;
		 } else {
			 return 0;
		 }		
	 }
	
	//call set password method
	 public void ChangePass(String pass) {
		 super.setPassword(pass);
	 }
		
	 //call set username method
	 public void ChangeUser(String user) {
		 super.setUsername(user);
	 }
	
	 //call sort and binary search method
	 public PhoneBookEntry SearchbyIdBinarySearch(int ID) {
		 y.SortId();
		 return y.SearchbyIdBinarySearch(ID);
	 }
		
	 //menu
	 public void Menu() {
		 //declare variables
		 int choice;
		 String first;
		 String last;
		 int ID;
		 String emad;
		 int zip;
		 String phone;
		 
		 //enter do-while to continuously allow user to choose unless user wants to stop
		 do {
			 System.out.println("1. Add a phone entry");
			 System.out.println("2. Edit a phone entry of a with a given first name and last name");
			 System.out.println("3. Delete a phone entry of a given first name and last name");
			 System.out.println("4. Sort the PhoneBookDirectory");
			 System.out.println("5. Search using linear search");
			 System.out.println("6. Search using binary search");
			 System.out.println("7. Print admin's info");
			 System.out.println("8. Change password");
			 System.out.println("9. Change Username");
			 System.out.println("10. Exit");
			 //get choice from user
			 choice =input.nextInt();
				
			 //if statements to run appropriate functions based on choice
			 if(choice == 1) {
				 System.out.println("Add an entry");
				 System.out.println("1. Use default settings");
				 System.out.println("2. Add first name and phone number");
				 System.out.println("3. Add all attributes");
				 int ch = input.nextInt();
				 
				 //if statements to call add method based on info provided by user
				 if (ch == 1) {
					 PhoneBookEntry holder = new PhoneBookEntry();
					 System.out.println(addEntry(holder));
				 } else if (ch == 2) {
					 System.out.print("Enter a first name: ");
					 first=input.next();
					 System.out.print("Enter a phone number: ");
					 last=input.next();
					 PhoneBookEntry holder=new PhoneBookEntry(first,last);
					 System.out.println(addEntry(holder));
				 } else if (ch == 3) {
					 System.out.print("Enter a first name: ");
					 first = input.next();
					 System.out.print("Enter a last name: ");
					 last = input.next();	
					 System.out.print("Enter an id: ");
					 ID = input.nextInt();
					 System.out.print("Enter the email address: ");
					 emad = input.next();
					 System.out.print("Enter the zipcode: ");
					 zip = input.nextInt();
					 System.out.print("Enter the phone number: ");
					 phone = input.next();
					 PhoneBookEntry holder=new PhoneBookEntry(ID, first,last,emad,zip,phone);
					 System.out.println(addEntry(holder));
				 } else {
					 System.out.println("Invalid choice");
				 }
			 //call edit method with info from user
			 } else if (choice == 2) {
				 System.out.print("Enter a first name of the entry you want to edit: ");
				 first = input.next();
				 System.out.print("Enter a last name of the entry you want to edit: ");
				 last = input.next();
				 System.out.println(Edit(first, last));
			 //call delete method if entry found
			 } else if (choice == 3) {
				 System.out.print("Enter the first name of the entry you want to delete: ");
				 first = input.next();
				 System.out.print("Enter the last name of the entry you want to delete: ");
				 last = input.next();
				 PhoneBookEntry [] place = y.getX();
				 for (int i = 0; i < place.length; i++) {
					 if (place[i] == null) {
						 System.out.println("0");
						 break;
					 } else if (place[i].getLastName() == null || place[i].getLastName()== null) {
						 System.out.println("0");
						 break;
					 } else if (place[i].getFirstName().equalsIgnoreCase(first) && place[i].getLastName().equalsIgnoreCase(last)) {
						 int hold = place[i].getId();
						 System.out.println(DeleteEntry(hold));
						 break;
					 }
				 }
			 //call sort method
			 } else if (choice == 4) {
				 SortId();
			 //call linear search method with phone number from user
			 } else if (choice == 5) {
				 System.out.print("Enter the phone number you want to search for: ");
				 phone = input.next();
				 System.out.println(LinearSearchByPhoneNumber(phone));
			 //call binary search method with id from user
			 } else if (choice == 6) {
				 System.out.print("Enter an ID: ");
				 ID = input.nextInt();
				 PhoneBookEntry hold = y.SearchbyIdBinarySearch(ID);
				 if (hold == null) {
					 System.out.println("ID: " + 0);
					 System.out.println("First name: " + "null");
					 System.out.println("Last name: " + "null");
					 System.out.println("Email: " + "null");
					 System.out.println("Zip code: " + 0);
					 System.out.println("Phone number: " + "null");
					 System.out.println();
				 } else {
					 hold.printBookEntry();
					 System.out.println();
				 }	
			 //call print method
			 } else if (choice == 7) {
				 PrintUserInfo();
			 //call change password method with password from user
			 } else if (choice == 8) {
				 System.out.println("Enter your new password: ");
				 String pass = input.next();
				 ChangePass(pass);
			 //call change username method with username from user
			 } else if (choice == 9) {
				 System.out.println("Enter your new username: ");
				 String user = input.next();
				 ChangeUser(user);
			 } else if (choice < 1){
				 System.out.println("Invalid selection");
			 }
		 } while (choice != 10);
	 }
}