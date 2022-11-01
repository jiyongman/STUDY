package boj;
import java.util.*;

public class BOJ24421 { // 掛け算 (Multiplication)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (arr[i] * arr[j] == arr[k]) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}