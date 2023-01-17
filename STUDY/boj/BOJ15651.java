package boj;
import java.util.*;

public class BOJ15651 { // N과 M (3)

    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        backtracking(0);
        System.out.println(sb);

        sc.close();
    }

    public static void backtracking(int k) {

        if (k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[k] = i;
            backtracking(k + 1);
        }
    }
}
