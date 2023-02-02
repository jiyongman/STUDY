package boj;
import java.util.*;

public class BOJ9776 { // Max Volume

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pi = 3.14159;
        double max = 0.0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            double v = 0.0;

            if (str.equals("C")) {
                double r = sc.nextDouble();
                double h = sc.nextDouble();
                v = 1.0 / 3.0 * pi * r * r * h;
            } else if (str.equals("L")) {
                double r = sc.nextDouble();
                double h = sc.nextDouble();
                v = pi * r * r * h;
            } else {
                double r = sc.nextDouble();
                v = 4.0 / 3.0 * pi * r * r * r;
            }

            max = Math.max(max, v);
        }

        System.out.printf("%.3f", max);
        sc.close();
    }
}