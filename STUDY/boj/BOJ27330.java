package boj;
import java.util.*;

public class BOJ27330 { // 点数 (Score)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int score = 0;

        for (int i = 0; i < N; i++) {
            score += A[i];

            for (int j = 0; j < M; j++) {
                if (score == B[j]) {
                    score = 0;
                }
            }
        }

        System.out.println(score);
        sc.close();
    }
}