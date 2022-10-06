package boj;
import java.util.*;

public class BOJ10813 { // 공 바꾸기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니의 개수
        int M = sc.nextInt(); // 공을 바꿀 횟수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int tmp = arr[A - 1];
            arr[A - 1] = arr[B - 1];
            arr[B - 1] = tmp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}