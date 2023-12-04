public class DistanceCalculator {
    private static final double EARTH_RADIUS_KM = 6371.0;

    public static double distanceCalculator(double userLat, double userLong, BathroomEntry bathroom) {
        double bathroomLat = bathroom.getLatitude();
        double bathroomLong = bathroom.getLongitude();

        double lat1Rad = Math.toRadians(userLat);
        double lat2Rad = Math.toRadians(bathroomLat);
        double lon1Rad = Math.toRadians(userLong);
        double lon2Rad = Math.toRadians(bathroomLong);

        double x = (lon2Rad - lon1Rad) * Math.cos((lat1Rad + lat2Rad) / 2);
        double y = (lat2Rad - lat1Rad);
        double distance = Math.sqrt(x * x + y * y) * EARTH_RADIUS_KM;

        return distance;
    }
}
