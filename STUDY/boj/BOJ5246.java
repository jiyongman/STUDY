package boj;
import java.util.*;

public class BOJ5246 { // Checkerboard Rows

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of boards

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // the number of pieces
            int[] rows = new int[9];

            for (int j = 0; j < p; j++) {
                int col = sc.nextInt();
                int row = sc.nextInt();
                rows[row]++;
            }

            int max = 0;

            for (int j = 1; j <= 8; j++) {
                max = Math.max(max, rows[j]);
            }

            System.out.println(max);
        }

        sc.close();
    }
}