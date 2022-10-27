package boj;
import java.util.*;

public class BOJ8295 { // Rectangles

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the dimensions of the grid
        int m = sc.nextInt(); // the dimensions of the grid
        int p = sc.nextInt(); // the lower bound for the perimeter of the rectangles
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (2 * (i + j) >= p) {
                    result += (n - i + 1) * (m - j + 1);
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}
