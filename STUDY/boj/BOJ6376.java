package boj;

public class BOJ6376 { // e 계산

    public static void main(String[] args) {

        System.out.println("n e");
        System.out.println("- -----------");

        double e = 0;

        for (int n = 0; n <= 9; n++) {
            e += 1.0 / factorial(n);

            if (n <= 1) {
                System.out.printf("%d %.0f\n", n, e);
            } else if (n == 2) {
                System.out.printf("%d %.1f\n", n, e);
            } else {
                System.out.printf("%d %.9f\n", n, e);
            }
        }
    }

    public static int factorial(int n) {

        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}