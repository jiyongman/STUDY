package boj;
import java.util.*;

public class BOJ1932 { // 정수 삼각형

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = sc.nextInt();
            }
        }

        int max = dp[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if (j == i) {
                    dp[i][j] += dp[i - 1][j - 1];
                } else {
                    dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }

                max = Math.max(max, dp[i][j]);
            }
        }

        System.out.println(max);
        sc.close();
    }
}
