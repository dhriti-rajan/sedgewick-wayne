public class $1231MercatorProjection {
    public static void main(String[] args) {
        double longitude0 = Double.parseDouble(args[0]);
        double latitude = Double.parseDouble(args[1]);
        double longitude = Double.parseDouble(args[2]);

        double x = longitude - longitude0;
        double y = 0.5 * Math.log((1 + Math.sin(latitude))/(1 - Math.sin(latitude)));

        System.out.println("Mercator Projection Coordinates: (" + x + ", " + y + ")");
    }
}
