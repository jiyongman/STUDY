package boj;
import java.util.*;

public class BOJ10695 { // Dalia

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 1; i <= T; i++) {
            long n = sc.nextLong();
            long r1 = sc.nextLong();
            long c1 = sc.nextLong();
            long r2 = sc.nextLong();
            long c2 = sc.nextLong();
            String str = "NO";

            if ((r2 == r1 - 1 || r2 == r1 + 1) && (c2 == c1 - 2 || c2 == c1 + 2)) {
                str = "YES";
            } else if ((r2 == r1 - 2 || r2 == r1 + 2) && (c2 == c1 - 1 || c2 == c1 + 1)) {
                str = "YES";
            }

            System.out.printf("Case %d: %s\n", i, str);
        }

        sc.close();
    }
}