package boj;
import java.util.*;

public class BOJ2579 { // 계단 오르기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 계단의 개수
        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt(); // 계단에 쓰여 있는 점수
        }

        dp[1] = arr[1];

        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i];
        }

        System.out.println(dp[n]);
        sc.close();
    }
}