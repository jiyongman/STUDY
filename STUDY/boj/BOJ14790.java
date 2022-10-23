package boj;
import java.util.*;

public class BOJ14790 { // Tidy Numbers (Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int N = sc.nextInt();
            int result = 0;

            for (int i = 1; i <= N; i++) {
                if (i < 10) {
                    result = i;
                } else if (i < 100) {
                    if (i / 10 <= i % 10) {
                        result = i;
                    }
                } else if (i < 1000) {
                    if (i / 100 <= i % 100 / 10 && i % 100 / 10 <= i % 10) {
                        result = i;
                    }
                }
            }

            System.out.printf("Case #%d: %d\n", x, result);
        }

        sc.close();
    }
}