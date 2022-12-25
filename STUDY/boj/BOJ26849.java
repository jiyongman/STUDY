package boj;
import java.util.*;

public class BOJ26849 { // Non Classical Problem

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the size of the given multiset
        double[] a = new double[N];
        double[] b = new double[N];
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextDouble();
            b[i] = sc.nextDouble();

            if (min > a[i] / b[i]) {
                min = a[i] / b[i];
            }

            if (max < a[i] / b[i]) {
                max = a[i] / b[i];
            }

            sum += a[i] / b[i];
        }

        System.out.printf("%f %f %f", min, max, sum);
        sc.close();
    }
}