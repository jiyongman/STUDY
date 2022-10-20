package boj;
import java.util.*;

public class BOJ17273 { // 카드 공장 (Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] arr = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // 카드의 앞면
            arr[i] = A[i];
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt(); // 카드의 뒷면
        }

        for (int i = 0; i < M; i++) {
            int K = sc.nextInt(); // 공장장이 말하는 수

            for (int j = 0; j < N; j++) {
                if (K >= arr[j]) {
                    if (arr[j] == A[j]) {
                        arr[j] = B[j];
                    } else {
                        arr[j] = A[j];
                    }
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        sc.close();
    }
}