package boj;
import java.util.*;

public class BOJ26145 { // 출제비 재분배

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 출제자의 수
        int M = sc.nextInt(); // 검수자의 수
        int[] S = new int[N + M];

        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }

        int[] T = new int[N + M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N + M; j++) {
                int k = sc.nextInt();
                T[j] += k;
                S[i] -= k;
            }
        }

        for (int i = 0; i < N + M; i++) {
            System.out.printf("%d ", S[i] + T[i]);
        }

        sc.close();
    }
}