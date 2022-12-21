package boj;
import java.util.*;

public class BOJ26548 { // Quadratics

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            System.out.printf("%.3f, %.3f\n", x1, x2);
        }

        sc.close();
    }
}