package boj;
import java.util.*;

public class BOJ27445 { // Gorani Command

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N + 1][M + 1];

        for (int i = 1; i <= N - 1; i++) {
            arr[i][1] = sc.nextInt();
        }

        for (int i = 1; i <= M; i++) {
            arr[N][i] = sc.nextInt();
        }

        int row = Integer.MAX_VALUE;
        int r = 0;

        for (int i = 1; i <= N; i++) {
            row = Math.min(row, arr[i][1]);

            if (row == arr[i][1]) {
                r = i;
            }
        }

        int col = Integer.MAX_VALUE;
        int c = 0;

        for (int i = 1; i <= M; i++) {
            col = Math.min(col, arr[N][i]);

            if (col == arr[N][i]) {
                c = i;
            }
        }

        System.out.printf("%d %d", r, c);
        sc.close();
    }
}