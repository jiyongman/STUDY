package boj;
import java.util.*;

public class BOJ26432 { // Walktober

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int M = sc.nextInt(); // the total number of participants
            int N = sc.nextInt(); // the total number of days the competition runs
            int P = sc.nextInt(); // the last year participant ID of John
            int[][] arr = new int[M][N];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int additional_steps = 0;

            for (int i = 0; i < N; i++) {
                int max = 0;

                for (int j = 0; j < M; j++) {
                    if (j != P - 1 && arr[j][i] > arr[P - 1][i]) {
                        max = Math.max(max, arr[j][i] - arr[P - 1][i]);
                    }
                }

                additional_steps += max;
            }

            System.out.printf("Case #%d: %d\n", x, additional_steps);
        }

        sc.close();
    }
}