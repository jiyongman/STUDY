package boj;
import java.util.*;

public class BOJ14889 { // 스타트와 링크

    static int N;
    static boolean[] visited;
    static int[][] arr;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[N + 1];
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        backtracking(0, 0);

        System.out.println(min);
        sc.close();
    }

    public static void backtracking(int k, int idx) {

        if (k == N / 2) {
            int start_score = 0;
            int link_score = 0;

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (visited[i] && visited[j]) {
                        start_score += arr[i][j] + arr[j][i];
                    } else if (!visited[i] && !visited[j]) {
                        link_score += arr[i][j] + arr[j][i];
                    }
                }
            }

            min = Math.min(min, Math.abs(start_score - link_score));
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(k + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}