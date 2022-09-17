package boj;
import java.util.*;

public class BOJ11047 { // 동전 0

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동전의 종류
        int K = sc.nextInt(); // 동전의 가치
        int[] arr = new int[N];
        int cnt = 0;

        for (int i  = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            if (K >= arr[i]) {
                cnt += (K / arr[i]);
                K = K % arr[i];
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}

