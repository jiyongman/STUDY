package boj;
import java.util.*;

public class BOJ15650 { // N과 M (2)

    static int N, M;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N + 1];
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
            if (!visited[i]) {
                arr[k] = i;
                visited[i] = true;
                backtracking(k + 1);

                for (int j = i + 1; j <= N; j++) {
                    visited[j] = false;
                }
            }
        }
    }
}
