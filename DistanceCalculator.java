import java.text.DecimalFormat;

public class DistanceCalculator {
    private static final double EARTH_RADIUS_KM = 6371.0;

    public static double distanceCalculator(double userLat, double userLong, BathroomEntry bathroom) {

        double bathroomLat = bathroom.getLatitude();
        double bathroomLong = bathroom.getLongitude();

        double distance = Math.sqrt(Math.pow((userLat - bathroomLat), 2) - Math.pow((userLong - bathroomLong), 2));
        return distance;
    }
}
