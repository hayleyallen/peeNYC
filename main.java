import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class main{
    public static void main(String[] args) throws IOException{
    	 Scanner input = new Scanner(System.in);
    	 
    	 try {
    		 FileReader fileReader = new FileReader("publicBathrooms");
    		 
    		 
    	 } catch(IOException E) {
    		 
    	 }
    	 

         ArrayList <BathroomEntry> publicBathrooms = new FileReader(pubb)
    }

	//check if user has an account
	public void login() {
		int x = 1;
		System.out.println("Do you have an account? y/n: ");
		if (input.next() == "y") {
			while (x == 1) {
				System.out.print("Enter username: ");
				String username = input.next();
				System.out.print("Enter password: ");
				String password = input.next();

				int index = UserDirectory().accountCheck(username, password);
				if (index == -2) {
					System.out.println("We couldn't find an account with that information. Enter 1 to try again or 0 to exit.");
					if (input.nextInt() == 0)
						x = 0;
				} else {
					System.out.println("Hi " + (UserDirectory().findName(i)));
					x = 0;
				}
			}
		}
	}

	//create account
	public void createAccount() {
		System.out.println("Name: ");
		String name = input.nextLine();
		System.out.println("Username: ");
		String username = input.nextLine();
		System.out.println("Password: ");
		String password = input.nextLine();
		User newUser = new User(name, username, password);
		UserDirectory().addEntry(newUser);
	}
}
