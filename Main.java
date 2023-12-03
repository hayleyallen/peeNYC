import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		String bathroomFile = "publicBathrooms";
		String line = null;

		String bathroomName = "";
		String bathroomRating = "";
		String bathroomAddress = "";
		String bathroomLat = "";
		String bathroomLong = "";
		String bathroomCode = "";
		String bathroomAccesibility = "";

		try {
			FileReader fileReader = new FileReader("publicBathrooms.txt");

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			int i = 0;
			while ((line = bufferedReader.readLine()) != null) {
				ArrayList<String> entries = new ArrayList<>();

				String[] tmp = line.split(",");

				entries.add(tmp[0].trim());
				bathroomName = entries.get(i);
				entries.add(tmp[1].trim());
				entries.add(tmp[2].trim());
				entries.add(tmp[3].trim());
				entries.add(tmp[4].trim());
				entries.add(tmp[5].trim());
				entries.add(tmp[6].trim());

			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + bathroomFile + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + bathroomFile + "'");
		}

		// ArrayList <BathroomEntry> publicBathrooms = //

	}

	// check if user has an account
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
