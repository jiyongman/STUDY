package boj;
import java.util.*;

public class BOJ4459 { // Always Follow the Rules in Zombieland

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine()); // the number of quotes
        String[] arr = new String[q + 1];

        for (int i = 1; i <= q; i++) {
            arr[i] = sc.nextLine();
        }

        int r = sc.nextInt(); // the number of rules to look up quotes for

        for (int i = 0; i < r; i++) {
            int n = sc.nextInt();

            if (n <= 0 || n > q) {
                System.out.println("Rule " + n + ": No such rule");
            } else {
                System.out.println("Rule " + n + ": " + arr[n]);
            }
        }

        sc.close();
    }
}