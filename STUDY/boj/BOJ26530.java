package boj;
import java.util.*;

public class BOJ26530 { // Shipping

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // how many items
            double sum = 0;

            for (int j = 0; j < x; j++) {
                String str = sc.next(); // the name of what was sold
                int q = sc.nextInt(); // the quantity of each item
                double p = sc.nextDouble(); // the unit price of each item
                sum += q * p;
            }

            System.out.printf("$%.2f\n", sum);
        }

        sc.close();
    }
}