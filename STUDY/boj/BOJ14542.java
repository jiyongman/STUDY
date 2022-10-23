package boj;
import java.util.*;

public class BOJ14542 { // Outer Triangle Sum

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 1;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    int k = sc.nextInt();

                    if (i == n) {
                        sum += k;
                    } else {
                        if (j == 1 || j == i) {
                            sum += k;
                        }
                    }
                }
            }

            System.out.printf("Case #%d:%d\n", x, sum);
            x++;
        }

        sc.close();
    }
}