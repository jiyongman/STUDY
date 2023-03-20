package boj;
import java.util.*;

public class BOJ27797 { // Vestigium

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int[][] matrix = new int[N][N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    matrix[j][k] = sc.nextInt();
                }
            }

            int a = 0;
            int b = 0;
            int c = 0;

            for (int j = 0; j < N; j++) {
                a += matrix[j][j];
            }

            for (int j = 0; j < N; j++) {
                boolean check = false;

                for (int k = 0; k < N - 1; k++) {
                    for (int l = k + 1; l < N; l++) {
                        if (matrix[j][k] == matrix[j][l]) {
                            b += 1;
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        break;
                    }
                }
            }

            for (int j = 0; j < N; j++) {
                boolean check = false;

                for (int k = 0; k < N - 1; k++) {
                    for (int l = k + 1; l < N; l++) {
                        if (matrix[k][j] == matrix[l][j]) {
                            c += 1;
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        break;
                    }
                }
            }

            System.out.printf("Case #%d: %d %d %d\n", i, a, b, c);
        }

        sc.close();
    }
}