package boj;
import java.util.*;

public class BOJ11051 { // 이항 계수 2

    static int N, K;
    static int[][] dp = new int[1001][1001];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        System.out.println(dp(N, K));
        sc.close();
    }

    public static int dp(int N, int K) {

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= Math.min(K, i); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
                }
            }
        }

        return dp[N][K];
    }
}