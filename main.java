import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException{
    	 Scanner input = new Scanner(System.in);
    	 
         String name;
         String stars;
         String address;
         String latitude;
         String longitude;
         String code;
         String accessibility;

    	 try {
    		 FileReader fileReader = new FileReader("publicBathrooms");
    		 BufferedReader bufferedReader = new BufferedReader(fileReader);

             while((line = bufferedReader.readLine())!=null){
                String [] entries = line.split(",");

                name = entries[0].trim();
                stars = entries[1].trim();
                address = ;
                latitude;
                longitude;
                code;
                accessibility;
             }
    	 } catch(IOException E) {
    		 
    	 }
    	 

         ArrayList <BathroomEntry> publicBathrooms = //
    }
}