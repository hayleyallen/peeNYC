public class DistanceCalculator {

    // Radius of the Earth in kilometers
    private static final long EARTH_RADIUS_KM = 6371L;

    // Convert degrees to radians
    private static double toRadians(long degrees) {
        return Math.toRadians(degrees / 1e6);
    }

    // Haversine formula to calculate distance between two points
    public static double haversineDistance(long lat1, long lon1, long lat2, long lon2) {
        double dLat = toRadians(lat2 - lat1);
        double dLon = toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(toRadians(lat1)) * Math.cos(toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS_KM * c;
    }

    public static double distanceCalculator(long userLat, long userLong, BathroomEntry bathroom) {
        long bathroomLat = bathroom.getLatitude();
        long bathroomLong = bathroom.getLongitude();

        double distance = haversineDistance(userLat, userLong, bathroomLat, bathroomLong);

        return distance;
    }

}
