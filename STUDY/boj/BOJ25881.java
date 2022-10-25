package boj;
import java.util.*;

public class BOJ25881 { // Electric Bill

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt(); // the rate/KWH for the first 1000 KWH
        int a = sc.nextInt(); // the rate/KWH for the additional usage
        int n = sc.nextInt(); // the number of customers

        for (int i = 0; i < n; i++) {
            int e = sc.nextInt(); // the customer’s energy consumption
            int c = 0; // the charges

            if (e <= 1000) {
                c = e * f;
            } else {
                c = 1000 * f + (e - 1000) * a;
            }

            System.out.printf("%d %d\n", e, c);
        }

        sc.close();
    }
}