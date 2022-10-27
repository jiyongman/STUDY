package boj;
import java.util.*;

public class BOJ16145 { // Tide Pods

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // the number of input data sets

        for (int x = 1; x <= K; x++) {
            int t = sc.nextInt(); // the number of traits we use for comparing people
            int n = sc.nextInt(); // the number of model people
            int[][] a = new int[n][t];
            int[] s = new int[n];
            int[] b = new int[t];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < t; j++) {
                    a[i][j] = sc.nextInt();
                }

                s[i] = sc.nextInt();
            }

            for (int i = 0; i < t; i++) {
                b[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int cnt = 0;

                for (int j = 0; j < t; j++) {
                    if (a[i][j] == 1 && b[j] == 1) {
                        cnt++;
                    }
                }

                s[i] *= cnt;
            }

            Arrays.sort(s);
            int result = s[n - 1] - s[0];

            System.out.printf("Data Set %d:\n", x);
            System.out.printf("%d\n\n", result);
        }

        sc.close();
    }
}