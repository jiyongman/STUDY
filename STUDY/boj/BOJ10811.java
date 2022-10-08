package boj;
import java.util.*;

public class BOJ10811 { // 바구니 뒤집기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니의 개수
        int M = sc.nextInt(); // 바구니를 역순으로 만들 횟수
        int[] arr = new int[N];

        for (int x = 0; x < N; x++) {
            arr[x] = x + 1;
        }

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int a = i;
            int b = j;

            for (int y = i; y <= (i + j) / 2; y++) {
                int tmp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = tmp;
                a++;
                b--;
            }
        }

        for (int x = 0; x < N; x++) {
            System.out.print(arr[x] + " ");
        }

        sc.close();
    }
}