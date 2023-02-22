package boj;
import java.util.*;

public class BOJ26529 { // Bunnies

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int[] dp = new int[x + 1];
            dp[0] = 1;

            if (x >= 1) {
                dp[1] = 1;
            }

            for (int j = 2; j <= x; j++) {
                dp[j] = dp[j - 2] + dp[j - 1];
            }

            System.out.println(dp[x]);
        }

        sc.close();
    }
}