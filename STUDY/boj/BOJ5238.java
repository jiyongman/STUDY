package boj;
import java.util.*;

public class BOJ5238 { // Stacked Floating Mountains

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of test cases

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            long[] arr = new long[k];

            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextLong();
            }

            int cnt = 0;

            for (int j = 2; j < k; j++) {
                if (arr[j] != arr[j - 2] + arr[j - 1]) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}