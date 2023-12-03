import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException{
    	
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
			FileReader fileReader = new FileReader("publicBathrooms");
		
			BufferedReader bufferedReader = new BufferedReader(fileReader);
		 
			int i = 0;
			while((line = bufferedReader .readLine()) != null) {
				String[] entries = line.split(",");
			
				bathroomName = entries[i].trim();
				bathroomRating = entries[i+1].trim();
				bathroomAddress = entries[i+2].trim();
				bathroomLat = entries[i+3].trim();
				bathroomLong = entries[i+4].trim();
				bathroomCode = entries[i+5].trim();
				bathroomAccesibility = entries[i+6].trim();

				i += 7;
			}

			bufferedReader.close();
		} catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + bathroomFile + "'");
		} catch(IOException ex) {
			System.out.println("Error reading file '" + bathroomFile + "'");
		}
	

    	 

         ArrayList <BathroomEntry> publicBathrooms = //
    }
}