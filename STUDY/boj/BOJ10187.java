package boj;
import java.util.*;

public class BOJ10187 { // Golden

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets
        double phi = (1 + Math.sqrt(5)) / 2;

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a < b) {
                double tmp = a;
                a = b;
                b = tmp;
            }

            if (a / b >= phi * 0.99 && a / b <= phi * 1.01) {
                System.out.println("golden");
            } else {
                System.out.println("not");
            }
        }

        sc.close();
    }
}