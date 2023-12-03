import java.util.ArrayList;

public class BathroomDirectory {
    private ArrayList<BathroomEntry> bathroomList = new ArrayList<BathroomEntry>();

    //add entry
	public void addEntry(BathroomEntry entry) {
		bathroomList.add(entry)
	}

    //search for bathroom by address and delete entry (if bathroom no longer there)
	public void DeleteEntry(String address) {
	    for (int i = 0; i < ArrayList.size(); i++) {
	        if (entry.get(i).getAddress() == address) {
	            entry.remove(i);
	        }
	    }
	}

	//print all bathroom names
	public void printBathrooms() {
		for (BathroomEntry bathroom : bathroomList)
			System.out.println(bathroom.getName());
	}
}