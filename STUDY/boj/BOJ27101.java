package boj;
import java.util.*;

public class BOJ27101 { // Metric Matrices

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (matrix[i][j] + matrix[j][k] < matrix[i][k]) {
                        result = 4;
                    }
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    result = 3;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i != j && matrix[i][j] <= 0) {
                    result = 2;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            if (matrix[i][i] != 0) {
                result = 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}