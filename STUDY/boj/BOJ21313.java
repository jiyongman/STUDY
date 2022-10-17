package boj;
import java.util.*;

public class BOJ21313 { // 문어

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문어의 수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i % 2 + 1;

            if (N % 2 > 0) {
                arr[N - 1] = 3;
            }

            System.out.printf("%d ", arr[i]);
        }

        sc.close();
    }
}