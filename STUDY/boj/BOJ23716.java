package boj;
import java.util.*;

public class BOJ23716 { // Transform the String

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            String S = sc.next();
            String F = sc.next();
            int y = 0;

            for (int i = 0; i < S.length(); i++) {
                int min = 27;

                for (int j = 0; j < F.length(); j++) {
                    int tmp = Math.min(Math.abs(S.charAt(i) - F.charAt(j)), 26 - Math.abs(S.charAt(i) - F.charAt(j)));
                    min = Math.min(min, tmp);
                }

                y += min;
            }

            System.out.printf("Case #%d: %d\n", x, y);
        }

        sc.close();
    }
}