package boj;
import java.util.*;

public class BOJ15649 { // N과 M (1)

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
                sb.append(String.format("%d ", arr[i]));
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                arr[k] = i;
                visited[i] = true;
                backtracking(k + 1);
                visited[i] = false;
            }
        }
    }
}