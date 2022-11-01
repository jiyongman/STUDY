package boj;
import java.util.*;

public class BOJ12167 { // Standing Ovation (Large)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int S = sc.nextInt(); // the maximum shyness level of the shyest person in the audience
            String str = sc.next(); // how many people in the audience have shyness level
            int cnt = 0;
            int y = 0; // the minimum number of friends you must invite

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '0') {
                    if (cnt >= i) {
                        cnt += str.charAt(i) - '0';
                    } else {
                        y += i - cnt;
                        cnt = i + str.charAt(i) - '0';
                    }
                }
            }

            System.out.printf("Case #%d: %d\n", x, y);
        }

        sc.close();
    }
}