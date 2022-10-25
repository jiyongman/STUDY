package boj;
import java.util.*;

public class BOJ9947 { // Coin tossing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            String str2 = sc.next();

            if (str.equals("#") && str2.equals("#")) {
                break;
            }

            int n = sc.nextInt(); // the number of recorded coin tosses
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                String S = sc.next();
                String S2 = sc.next();

                if ((S.equals("H") && S2.equals("H")) || (S.equals("T") && S2.equals("T"))) {
                    cnt++;
                }
            }

            System.out.printf("%s %d %s %d\n", str, cnt, str2, n - cnt);

        }

        sc.close();
    }
}