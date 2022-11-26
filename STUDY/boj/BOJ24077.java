package boj;
import java.util.*;

public class BOJ24077 { // 比較 (Comparison)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i] <= B[j]) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}