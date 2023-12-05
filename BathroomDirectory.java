import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

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
    public void printBathrooms(double userLat, double userLong) {

        DecimalFormat f = new DecimalFormat("#0.00");

        ArrayList<BathroomEntry> sortedList = new ArrayList<>();
        double[] distanceArray = new double[size];
        sortBathrooms(userLat, userLong, distanceArray, sortedList);

        for (int i = 0; i < size; i++) {
            System.out.print(bathroomList.get(i).getName() + ": ");
            System.out.print(f.format(distanceArray[i]) + " mi away");
            System.out.println();
        }
    }

    public void sortBathrooms(double userLat, double userLong, double[] distanceArray,
            ArrayList<BathroomEntry> sortedList) {

        for (int i = 0; i < size; i++) {
            double distance = DistanceCalculator.calculateDistance(userLat, userLong, bathroomList.get(i));
            distanceArray[i] = distance;
        }

        Arrays.sort(distanceArray);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (distanceArray[i] == DistanceCalculator.calculateDistance(userLat, userLong, bathroomList.get(j))) {
                    sortedList.add(getEntry(j));
                }
            }
        }

        bathroomList = sortedList;
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
            if (bathroomList.get(i).getAddress().equals(address)) {
                bathroomList.remove(i);
            }
        }
    }
}