package boj;
import java.util.*;

public class BOJ17173 { // 배수들의 합

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int K = sc.nextInt();

            for (int j = 1; j <= N; j++) {
                if (j % K == 0) {
                    arr[j]++;
                }
            }
        }

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (arr[i] > 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}