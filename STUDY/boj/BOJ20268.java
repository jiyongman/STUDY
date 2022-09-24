package boj;
import java.util.*;

public class BOJ20268 { // Keystroke

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            for (int j = 0; j < m; j++) {
                int row = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                int col = sc.nextInt();
            }

            if (m + n == 4) {
                System.out.println(7);
            } else {
                System.out.println(1);
            }
        }

        sc.close();
    }
}