import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class main {
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

			while ((line = bufferedReader.readLine()) != null) {
				ArrayList<String> entries = new ArrayList<>();

				String[] tmp = line.split(",");

				entries.add(tmp[0].trim());
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
}