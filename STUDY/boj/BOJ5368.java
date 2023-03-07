package boj;
import java.util.*;

public class BOJ5368 { // Escape Route

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            char[][] grid = new char[m][m];

            for (int j = 0; j < m; j++) {
                String str = sc.next();

                for (int k = 0; k < m; k++) {
                    grid[j][k] = str.charAt(k);
                }
            }

            int x1 = 0;
            int y1 = 0;

            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    if (grid[j][k] == 's') {
                        x1 = j;
                        y1 = k;
                    }
                }
            }

            int x2 = 0;
            int y2 = 0;
            double dist = Double.MAX_VALUE;

            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    if (grid[j][k] == 'p') {
                        if (dist > Math.sqrt(Math.pow(x1 - j, 2) + Math.pow(y1 - k, 2))) {
                            dist = Math.sqrt(Math.pow(x1 - j, 2) + Math.pow(y1 - k, 2));
                            x2 = j;
                            y2 = k;
                        }
                    }
                }
            }

            System.out.printf("(%d,%d):(%d,%d):%.02f\n", x1, y1, x2, y2, dist);
        }

        sc.close();
    }
}