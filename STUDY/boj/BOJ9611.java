package boj;
import java.util.*;

public class BOJ9611 { // Vicinity

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of points
        int[] x = new int[n + 1];
        int[] y = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int t = sc.nextInt(); // the number of test cases

        for (int j = 0; j < t; j++) {
            int i = sc.nextInt();
            int d = sc.nextInt();

            int result = 0;

            for (int k = 1; k <= n; k++) {
                if (k != i && Math.sqrt(Math.pow(x[i] - x[k], 2) + Math.pow(y[i] - y[k], 2)) <= d) {
                    result++;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}