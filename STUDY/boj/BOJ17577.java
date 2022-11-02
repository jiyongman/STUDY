package boj;
import java.util.*;

public class BOJ17577 { // Scores of Final Examination

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt(); // the number of students
            int m = sc.nextInt(); // the number of subjects

            if (n == 0 && m == 0) {
                break;
            }

            int[][] arr = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = 0;

            for (int i = 0; i < n; i++) {
                int sum = 0;

                for (int j = 0; j < m; j++) {
                    sum += arr[j][i];
                }

                if (max < sum) {
                    max = sum;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}