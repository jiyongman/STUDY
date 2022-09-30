package boj;
import java.util.*;

public class BOJ1434 { // 책 정리

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 박스의 개수
        int M = sc.nextInt(); // 책의 개수
        int[] arr = new int[N];
        int[] arr2 = new int[M];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i] >= arr2[j]) {
                    arr[i] -= arr2[j];
                    arr2[j] = 0;
                }
            }

            result += arr[i];
        }

        System.out.println(result);
        sc.close();
    }
}