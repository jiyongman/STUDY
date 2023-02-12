package boj;
import java.util.*;

public class BOJ9782 { // Median

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = 1;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            double[] d = new double[n + 1];

            for (int i = 1; i <= n; i++) {
                d[i] = sc.nextDouble();
            }

            double median = 0.0;

            if (n % 2 > 0) {
                median = d[(n + 1) / 2];
            } else {
                median = (d[n / 2] + d[n / 2 + 1]) / 2;
            }

            System.out.printf("Case %d: %.1f\n", k, median);
            k++;
        }

        sc.close();
    }
}