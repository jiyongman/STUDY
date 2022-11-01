package boj;
import java.util.*;

public class BOJ18413 { // 最頻値 (Mode)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] arr2 = new int[M + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
            arr2[arr[i]]++;
        }

        int max = 0;

        for (int i = 1; i <= M; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }

        System.out.println(max);
        sc.close();
    }
}