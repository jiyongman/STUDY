package boj;
import java.util.*;

public class BOJ10708 { // 크리스마스 파티

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 친구들의 수
        int M = sc.nextInt(); // JOI와 친구들이 했던 게임의 횟수
        int[] A = new int[M];

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt(); // 게임의 타겟
        }

        int[][] B = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt(); // 종이에 쓴 이름
            }
        }

        int[] arr = new int[N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (B[i][A[i] - 1] == B[i][j]) {
                    arr[j]++;
                } else {
                    arr[A[i] - 1]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}