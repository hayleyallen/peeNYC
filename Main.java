import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main extends BathroomDirectory {
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
		BathroomDirectory bathroomDirectory = new BathroomDirectory();
		UserDirectory userDirectory = new UserDirectory();

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
				double rating = Double.valueOf(bathroomRating);

				entries.add(tmp[2].trim());
				bathroomAddress = entries.get(i + 2);

				entries.add(tmp[3].trim());
				bathroomLat = entries.get(i + 3);
				double latitude = Double.parseDouble(bathroomLat);

				entries.add(tmp[4].trim());
				bathroomLong = entries.get(i + 4);
				double longitude = Double.parseDouble(bathroomLong);

				entries.add(tmp[5].trim());
				bathroomCode = entries.get(i + 5);
				int code = Integer.valueOf(bathroomCode);

				entries.add(tmp[6].trim());
				bathroomAccesibility = entries.get(i + 6);
				boolean accessibility = Boolean.valueOf(bathroomAccesibility);

				i += 7;

				BathroomEntry bathroom = new BathroomEntry(bathroomName, rating, bathroomAddress, latitude, longitude,
						code, accessibility);

				bathroomDirectory.addEntry(bathroom);

			}

			bufferedReader.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + bathroomFile + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + bathroomFile + "'");
		}

		System.out.println();
		System.out.println("PeeNYC");
		System.out.println();
		System.out.println("Find public bathrooms in New York City");
		System.out.println("---------------------------------------");
		System.out.println("Easily find accessible, gender-neutral, public bathrooms near you!");

		while (true) {
			System.out.println();
			System.out.println("Would you like to enter? (yes/no)");
			String answer = input.next();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Enter your location (in latitude then longitude separated by only a comma)");
				String userLatDouble = input.next();
				String[] latDouble = userLatDouble.split(",");
				String latitude = latDouble[0];
				String longitude = latDouble[1];
				double longitude1 = Double.parseDouble(longitude);
				double latitude1 = Double.parseDouble(latitude);

				bathroomDirectory.printBathrooms(latitude1, longitude1);

				int choice = 0;
				while (choice != -1) {
					// menu
					System.out.println();
					System.out.println("You can perform any of the following actions... ");
					System.out.println("1. View a bathroom's details");
					System.out.println("2. Add a bathroom");
					System.out.println("3. Leave a review");
					System.out.println("4. Exit app");

					// validate input
					try {
						choice = input.nextInt();
						System.out.println();
					} catch (Exception e) {
						System.err.println("Cannot read in your response as an integer");
					}

					switch (choice) {
						case 1:
							System.out.println("Which bathroom do you want to view details of? (by name)");
							input.nextLine(); // Consume any residual characters
							String tmp = input.nextLine().trim();
							tmp = tmp.trim();

							System.out.println();
							int index = bathroomDirectory.findBathroomByName(tmp);
							if (index == -1)
								System.out.println("No bathroom found");
							else
								bathroomDirectory.getEntry(index).printBathroomEntry();

							break;

						case 2:
							if (login(userDirectory)) {
								System.out.println();
								System.out.print("Enter Name: ");
								input.nextLine(); // Consume any residual characters
								String name = input.nextLine().trim();
								name = name.trim();
								System.out.print("Enter Rating (1 - 5): ");
								double rating = input.nextDouble();
								System.out.print("Enter Address: ");
								input.nextLine(); // Consume any residual characters
								String address = input.nextLine().trim();
								address = address.trim();
								System.out.print("Enter latitude: ");
								double latitude_ = input.nextDouble();
								System.out.print("Enter Latitude: ");
								double longitude_ = input.nextDouble();
								System.out.print("Enter code (-1 for no code): ");
								int status = input.nextInt();
								System.out.print("Is it accesible (T/F): ");
								String accessTF = input.next();
								boolean access = false;
								if (accessTF.equalsIgnoreCase("T")) {
									access = true;
								} else if (accessTF.equalsIgnoreCase("F")) {
									access = false;
								}
								BathroomEntry bathroom2 = new BathroomEntry(name, rating, address, latitude_,
										longitude_,
										status, access);
								bathroomDirectory.addEntry(bathroom2);
								System.out.println("Successfully added!");
								System.out.println();
							} else {
								System.out.println("Sorry, cannot add a bathroom without an account");
							}
							break;

						case 3:
							if (login(userDirectory)) {

								System.out.println("Which bathroom do you want to leave a review for? (by name)");
								input.nextLine(); // Consume any residual characters
								String brName = input.nextLine().trim();
								brName = brName.trim();

								System.out.println();
								int index_ = bathroomDirectory.findBathroomByName(brName);
								if (index_ == -1)
									System.out.println("No bathroom found");
								else
									System.out.println();
								System.out.println("Rate this bathroom out from 0-5 stars");
								double rate = input.nextDouble();
								double calcRating = (bathroomDirectory.getEntry(index_).getRating() + rate) / 2;
								bathroomDirectory.getEntry(index_).setRating(calcRating);
							} else {
								System.out.println("Sorry, cannot leave a review without an account");
							}
							break;
						case 4:
							System.out.println();
							System.out.print("exiting app***");
							System.out.println();
							choice = -1;
							System.exit(0);

					}

				}
			} else if (answer.equalsIgnoreCase("no")) {
				break;
			} else {
				System.out.println();
				System.out.print("Invalid answer option, please type yes or no");
				System.out.println();
			}

		}
		System.out.print("exiting app***");
		System.out.println();
	}

	// check if user has an account
	public static boolean login(UserDirectory userDirectory) {
		boolean validLogin = false;
		Scanner input = new Scanner(System.in);
		int x = 1;
		System.out.println("Do you have an account? y/n: ");
		String answer = input.next();
		if (answer.equalsIgnoreCase("y")) {
			while (x == 1) {
				System.out.print("Enter username: ");
				String username = input.next();
				System.out.print("Enter password: ");
				String password = input.next();
				int index = userDirectory.accountCheck(username, password);
				if (index == -2) {
					System.out.println(
							"We couldn't find an account with that information. Enter 1 to try again or 0 to exit.");
					if (input.nextInt() == 0) {
						x = 0;
					}
				} else {
					System.out.println("Hi " + (userDirectory.findName(index)));
					x = 0;
					validLogin = true;
				}
			}
		} else {
			System.out.println("Would you like to create an account? (y/n) ");
			String ans = input.next();
			if (ans.equalsIgnoreCase("y")) {
				validLogin = createAccount(userDirectory);
			}
		}
		return validLogin;
	}

	// create account
	public static boolean createAccount(UserDirectory userDirectory) {

		Scanner input = new Scanner(System.in);

		boolean x = true;
		boolean validCreate = false;
		int canCreateInt;

		while (x == true) {
			System.out.println("Name: ");
			String name = input.nextLine();
			System.out.println("Username: ");
			String username = input.nextLine();
			System.out.println("Password: ");
			String password = input.nextLine();

			canCreateInt = 1;

			for (int i = 0; i < userDirectory.getSize(); i++) {
				if (userDirectory.getEntry(i).getUsername().equals(username)) {
					System.out.println("Username unavailable");
					System.out.print("Would you like to try again? (y/n)");
					String response = input.nextLine();
					System.out.println();
					if (response.equalsIgnoreCase("n")) {
						canCreateInt = -1;
						x = false;
						break;
					} else {
						canCreateInt = -1;
					}
				}

			}
			if (canCreateInt != -1) {
				User newUser = new User(username, password, name);
				userDirectory.addEntry(newUser);
				System.out.print("Account created!");
				x = false;
				validCreate = true;
				break;
			}
		}
		return validCreate;
	}
}
