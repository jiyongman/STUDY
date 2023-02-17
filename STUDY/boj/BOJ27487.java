package boj;
import java.util.*;

public class BOJ27487 { // One and Two

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];

            for (int j = 1; j <= n; j++) {
                a[j] = sc.nextInt() - 1;
            }

            int x = 0;
            int result = -1;

            for (int j = 1; j <= n - 1; j++) {
                x += a[j];
                int y = 0;

                for (int k = j + 1; k <= n; k++) {
                    y += a[k];
                }

                if (x == y) {
                    result = j;
                    break;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}