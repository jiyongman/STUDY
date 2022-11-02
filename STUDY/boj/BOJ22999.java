package boj;
import java.util.*;

public class BOJ22999 { // K-Goodness String

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int N = sc.nextInt(); // the length of String S
            int K = sc.nextInt();
            String S = sc.next();
            int y = 0; // the minimum number of operations required to transform

            for (int i = 0; i < N / 2; i++) {
                if (S.charAt(i) != S.charAt(N - 1 - i)) {
                    y++;
                }
            }

            y = Math.abs(K - y);

            System.out.printf("Case #%d: %d\n", x, y);
        }

        sc.close();
    }
}