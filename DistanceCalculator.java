public class DistanceCalculator {

    public static double distanceCalculator(long userLat, long userLong, BathroomEntry bathroom) {
        long bathroomLat = bathroom.getLatitude();
        long bathroomLong = bathroom.getLongitude();

        /*
         * 2R × sin⁻¹(√[sin²((θ₂ - θ₁)/2) + cosθ₁ × cosθ₂ × sin²((φ₂ - φ₁)/2)])
         * θ₁, φ₁ – First point latitude and longitude coordinates;
        θ₂, φ₂ – Second point latitude and longitude coordinates;
        R – Earth's radius (R = 6371 km); and
         */

         double distance = 2(6371) * sin

    }
}
