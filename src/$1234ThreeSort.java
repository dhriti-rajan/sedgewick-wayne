public class $1234ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("Smallest: " + Math.min(a, Math.min(b, c)));
        System.out.println("Middle: " + Math.max(Math.min(a, Math.min(b, c)),
                Math.min(Math.max(a, Math.max(b, c)), Math.min(a, Math.max(b, c)))));
        System.out.println("Largest: " + Math.max(a, Math.max(b, c)));
    }
}
