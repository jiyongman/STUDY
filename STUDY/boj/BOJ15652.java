package boj;
import java.util.*;

public class BOJ15652 { // N과 M (4)

    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        backtracking(1, 0);
        System.out.println(sb);

        sc.close();
    }

    public static void backtracking(int i, int k) {

        if (k == M) {
            for (int j = 0; j < M; j++) {
                sb.append(arr[j]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int j = i; j <= N; j++) {
            arr[k] = j;
            backtracking(j, k + 1);
        }
    }
}