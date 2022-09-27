package boj;
import java.util.*;

public class BOJ16175 { // General Election

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // the number of candidate
            int M = sc.nextInt(); // the number of region
            int[][] v = new int[M][N];

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    v[j][k] = sc.nextInt();
                }
            }

            int max = 0;
            int result = 0;

            for (int j = 0; j < N; j++) {
                int sum = 0;

                for (int k = 0; k < M; k++) {
                    sum += v[k][j];
                }

                if (sum > max) {
                    max = sum;
                    result = j + 1;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}