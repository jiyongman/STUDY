package boj;
import java.util.*;

public class BOJ10810 { // 공 넣기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니의 개수
        int M = sc.nextInt(); // 공을 넣을 횟수
        int[] arr = new int[N];

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int y = i; y <= j; y++) {
                arr[y - 1] = k;
            }
        }

        for (int x = 0; x < N; x++) {
            System.out.print(arr[x] + " ");
        }

        sc.close();
    }
}