package boj;
import java.util.*;

public class BOJ26500 { // Absolutely

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a < b) {
                double tmp = a;
                a = b;
                b = tmp;
            }

            double d = a - b;

            System.out.printf("%.1f\n", d);
        }

        sc.close();
    }
}