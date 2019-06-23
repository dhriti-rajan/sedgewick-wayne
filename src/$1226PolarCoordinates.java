public class $1226PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(x * x + y * y);
        double t = Math.atan(y/x);
        System.out.println("Polar Coordinates: (" + r + ", " + t + ")");
    }
}
