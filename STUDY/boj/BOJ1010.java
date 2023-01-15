package boj;
import java.util.*;

public class BOJ1010 { // 다리 놓기

    static int N, M;
    static int[][] dp = new int[31][31];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            N = sc.nextInt();
            M = sc.nextInt();

            System.out.println(dp(M, N));
        }

        sc.close();
    }

    public static int dp(int M, int N) {

        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= Math.min(N, i); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[M][N];
    }
}