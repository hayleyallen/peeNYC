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
    public void printBathrooms(long userLat, long userLong) {
        double[] distanceArray = new double[size];
        sortBathrooms(userLat, userLong, distanceArray);

        for (int i = 0; i < size; i++) {
            System.out.print(bathroomList.get(i).getName() + " ");
            System.out.println();
        }
    }

    public void sortBathrooms(long userLat, long userLong, double[] distanceArray) {
        double latitude = userLat;
        double longitude = userLong;

        for (int i = 0; i < size; i++) {
            double distance = DistanceCalculator.distanceCalculator(userLat, userLong, bathroomList.get(i));
            distanceArray[i] = distance;
        }
    }

    public int findBathroomByName(String name) {
        for (int i = 0; i < size; i++) {
            if (bathroomList.get(i).getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
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