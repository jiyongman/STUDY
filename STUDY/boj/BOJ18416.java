package boj;
import java.util.*;

public class BOJ18416 { // 最長昇順連続部分列 (Longest Ascending Contiguous Subsequence)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int max = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i - 1] <= arr[i]) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }
        }

        max = Math.max(max, cnt);

        System.out.println(max);
        sc.close();
    }
}