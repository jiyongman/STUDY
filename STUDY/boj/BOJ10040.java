package boj;
import java.util.*;

public class BOJ10040 { // 투표

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 경기의 수
        int M = sc.nextInt(); // 위원의 수
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // 경기를 개최하는데 필요한 비용
        }

        int[] B = new int[M];
        int[] arr = new int[N];

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt(); // 위원의 심사 기준

            for (int j = 0; j < N; j++) {
                if (A[j] <= B[i]) {
                    arr[j]++;
                    break;
                }
            }
        }

        int max = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i + 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}