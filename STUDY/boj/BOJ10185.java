package boj;
import java.util.*;

public class BOJ10185 { // Focus

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            double p = sc.nextDouble(); // the object distance
            double q = sc.nextDouble(); // the image distance
            double f = p * q / (p + q); // the distance to the focus

            System.out.printf("f = %.1f\n", f);
        }

        sc.close();
    }
}