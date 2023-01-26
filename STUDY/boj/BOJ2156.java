package boj;
import java.util.*;

public class BOJ2156 { // 포도주 시식

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wine = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            wine[i] = sc.nextInt();
        }

        dp[1] = wine[1];

        if (n >= 2) {
            dp[2] = wine[1] + wine[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2], dp[i - 3] + wine[i - 1]) + wine[i]);
        }

        System.out.println(dp[n]);
        sc.close();
    }
}