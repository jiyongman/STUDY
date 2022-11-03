package boj;
import java.util.*;

public class BOJ20978 { // 共通要素 (Common Elements)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[101];

        for (int i = 0; i < M; i++) {
            int K = sc.nextInt();

            for (int j = 0; j < N; j++) {
                if (arr[j] == K) {
                    arr2[K]++;
                }
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (arr2[i] > 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}