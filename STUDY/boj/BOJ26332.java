package boj;
import java.util.*;

public class BOJ26332 { // Buying in Bulk

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of customers to check

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt(); // the number of items purchased by the customer
            int p = sc.nextInt(); // the price for one item
            int sum = 0;

            if (c == 1) {
                sum = p;
            } else {
                sum = c * p - (2 * (c - 1));
            }

            System.out.printf("%d %d\n%d\n", c, p, sum);
        }

        sc.close();
    }
}