package boj;
import java.util.*;

public class BOJ1904 { // 01타일

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
        }

        System.out.println(dp[N]);
        sc.close();
    }
}
