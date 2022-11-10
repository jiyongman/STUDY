package boj;
import java.util.*;

public class BOJ9636 { // NASSA’s Robot

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int X = 0;
            int Y = 0;
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'U') {
                    Y++;
                } else if (str.charAt(j) == 'R') {
                    X++;
                } else if (str.charAt(j) == 'D') {
                    Y--;
                } else if (str.charAt(j) == 'L') {
                    X--;
                } else {
                    cnt++;
                }
            }

            System.out.printf("%d %d %d %d\n", X - cnt, Y - cnt, X + cnt, Y + cnt);
        }

        sc.close();
    }
}