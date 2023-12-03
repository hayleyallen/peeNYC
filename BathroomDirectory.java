import java.util.ArrayList;

public class BathroomDirectory {
    private ArrayList<BathroomEntry> bathroomList = new ArrayList<BathroomEntry>();

    public int size;

    public int getSize() {
        return size;
    }

    // add entry
    public void addEntry(BathroomEntry entry) {
        bathroomList.add(entry);
        size++;
    }

    // print all bathroom names
    public void printBathrooms() {
        for (BathroomEntry bathroom : bathroomList)
            System.out.print(bathroom.getName());

    }

    public BathroomEntry getEntry(int index) {
        return bathroomList.get(index);
    }

    // search for bathroom by address and delete entry (if bathroom no longer there)
    public void DeleteEntry(String address) {
        for (int i = 0; i < bathroomList.size(); i++) {
            if (bathroomList.get(i).getAddress() == address) {
                bathroomList.remove(i);
            }
        }
    }
}