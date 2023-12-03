import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		String bathroomFile = "publicBathrooms";
		String line = null;

		String bathroomName = "";
		String bathroomRating = "";
		String bathroomAddress = "";
		String bathroomLat = "";
		String bathroomLong = "";
		String bathroomCode = "";
		String bathroomAccesibility = "";
		ArrayList<String> entries = new ArrayList<>();

		try {
			FileReader fileReader = new FileReader("publicBathrooms.txt");

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			int i = 0;

			while ((line = bufferedReader.readLine()) != null) {

				String[] tmp = line.split(",");

				entries.add(tmp[0].trim());
				bathroomName = entries.get(i);

				entries.add(tmp[1].trim());
				bathroomRating = entries.get(i + 1);

				entries.add(tmp[2].trim());
				bathroomAddress = entries.get(i + 2);

				entries.add(tmp[3].trim());
				bathroomLat = entries.get(i + 3);

				entries.add(tmp[4].trim());
				bathroomLong = entries.get(i + 4);

				entries.add(tmp[5].trim());
				bathroomCode = entries.get(i + 5);

				entries.add(tmp[6].trim());
				bathroomAccesibility = entries.get(i + 6);

				i += 7;

			}

			bufferedReader.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + bathroomFile + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + bathroomFile + "'");
		}
		for (String element : entries) {
			System.out.println(element);
		}

		// ArrayList <BathroomEntry> publicBathrooms = //
		while(true){
			System.out.println("PeeNYC");
			System.out.println("Find public bathrooms in New York City");
			System.out.println("---------------------------------------");
			System.out.println("easily find accessible, gender-neutral, public bathrooms near you!");
   
			System.out.println("Would you like to enter?");
			if(input.next.equalsIgnoreCase("yes")){
			   System.out.print("Enter your location (in latitude then longitude separated by a space)");
			   String userLatLong = input.nextLine();
			   String[] latLong = userLatLong.split(" ");
			   String latitude = latLong[0];
			   String longitude = latLong[1];
			   
			   for(int i = 0 ; i<; i++){
				if(.get(i).)
			   }

			   String choice = "";
			   while(choice!=null){
				
			   }
			}else if(input.next.equalsIgnoreCase("no")){
			   break;
			}else{
			   System.out.print("Invalid answer option, please type yes or no");
			}
		   }
		   System.out.print("exiting app***");
	   }

	}

	// check if user has an account
	public void login() {
		Scanner input = new Scanner(System.in);
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
					System.out.println(
							"We couldn't find an account with that information. Enter 1 to try again or 0 to exit.");
					if (input.nextInt() == 0)
						x = 0;
				} else {
					System.out.println("Hi " + (UserDirectory().findName(i)));
					x = 0;
				}
			}
		}
	}

	// create account
	public void createAccount() {
		Scanner input = new Scanner(System.in);
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
