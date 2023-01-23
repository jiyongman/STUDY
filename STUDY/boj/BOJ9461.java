package boj;
import java.util.*;

public class BOJ9461 { // 파도반 수열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] dp = new long[101];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int j = 4; j <= 100; j++) {
            dp[j] = dp[j - 3] + dp[j - 2];
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();

            System.out.println(dp[N]);
        }

        sc.close();
    }
}
