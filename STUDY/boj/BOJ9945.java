package boj;
import java.util.*;

public class BOJ9945 { // Centroid of Point Masses

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int j = 1;

        while (true) {
            int n = sc.nextInt(); // the number of points

            if (n < 0) {
                break;
            }

            double sum = 0;
            double sum2 = 0;
            double sum3 = 0;

            for (int i = 0; i < n; i++) {
                double x = sc.nextDouble(); // the coordinates
                double y = sc.nextDouble(); // the coordinates
                double m = sc.nextDouble(); // the mass
                sum += m * x;
                sum2 += m * y;
                sum3 += m;
            }

            double a = sum / sum3;
            double b = sum2 / sum3;

            System.out.printf("Case %d: %.2f %.2f\n", j, a, b);
            j++;
        }

        sc.close();
    }
}