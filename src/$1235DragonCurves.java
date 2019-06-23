public class $1235DragonCurves {
    public static void main(String[] args) {
        String zero = "F";
        System.out.println("Order 0: " + zero);

        for (int x = 1; x <= 5; ++x) {
            String one = zero + "L" + reverse(zero);
            System.out.println("Order " + x + ": " + one);
            zero = one;
        }
    }

    private static String reverse(String s) {
        String output = "";
        for (int x = s.length() - 1; x >= 0; --x) {
            if (s.charAt(x) == 'F') {
                output += "F";
            } else if (s.charAt(x) == 'L') {
                output += "R";
            } else {
                output += "L";
            }
        }
        return output;
    }
}
