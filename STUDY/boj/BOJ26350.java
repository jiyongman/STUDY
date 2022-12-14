package boj;
import java.util.*;

public class BOJ26350 { // Good Coin Denomination

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of denomination sets to check

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int[] arr = new int[d];

            System.out.print("Denominations: ");

            for (int j = 0; j < d; j++) {
                arr[j] = sc.nextInt();

                System.out.printf("%d ", arr[j]);
            }

            System.out.println();

            int cnt = 0;

            for (int j = 1; j < d; j++) {
                if (2 * arr[j - 1] <= arr[j]) {
                    cnt++;
                }
            }

            if (cnt == d - 1) {
                System.out.printf("Good coin denominations!\n\n");
            } else {
                System.out.printf("Bad coin denominations!\n\n");
            }
        }

        sc.close();
    }
}