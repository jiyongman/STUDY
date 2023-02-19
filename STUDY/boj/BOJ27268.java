package boj;
import java.util.*;

public class BOJ27268 { // Рамки

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        char[][] fields = new char[h + 1][w + 1];

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                fields[i][j] = '.';
            }
        }

        for (int i = 0; i < n; i++) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            for (int j = r1; j <= c1; j++) {
                for (int k = r2; k <= c2; k++) {
                    if (j == r1 || j == c1 || k == r2 || k == c2) {
                        fields[j][k] = (char) (i + 'a');
                    }
                }
            }
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print(fields[i][j]);
            }

            System.out.println();
        }

        sc.close();
    }
}