package boj;
import java.util.*;

public class BOJ24957 { // Loop of Chocolate

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of spheres
        int r = sc.nextInt(); // the radius
        double[] x = new double[n + 1];
        double[] y = new double[n + 1];
        double[] z = new double[n + 1];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
            z[i] = sc.nextDouble();
        }

        x[n] = x[0];
        y[n] = y[0];
        z[n] = z[0];
        double sum = n * 4 * Math.PI * r * r * r / 3;

        for (int i = 1; i < n + 1; i++) {
            double d = Math.sqrt(Math.pow(x[i - 1] - x[i], 2) + Math.pow(y[i - 1] - y[i], 2) + Math.pow(z[i - 1] - z[i], 2));
            double v = 2.0 / 3.0 * Math.PI * Math.pow(r - d / 2, 2) * (2 * r + d / 2);

            sum -= v;
        }

        System.out.println(sum);
        sc.close();
    }
}