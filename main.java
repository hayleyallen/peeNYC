import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException {

		String bathroomFile = "publicBathrooms";
		String line = null;

		boolean bathroomName = false;
		boolean bathroomRating = false;
		boolean bathroomAddress = false;
		boolean bathroomLat = false;
		boolean bathroomLong = false;
		boolean bathroomCode = false;
		boolean bathroomAccesibility = false;

		try {
			FileReader fileReader = new FileReader("publicBathrooms.txt");

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				ArrayList<String> entries = new ArrayList<>();

				String[] tmp = line.split(",");

				bathroomName = entries.add(tmp[0].trim());
				bathroomRating = entries.add(tmp[1].trim());
				bathroomAddress = entries.add(tmp[2].trim());
				bathroomLat = entries.add(tmp[3].trim());
				bathroomLong = entries.add(tmp[4].trim());
				bathroomCode = entries.add(tmp[5].trim());
				bathroomAccesibility = entries.add(tmp[6].trim());

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