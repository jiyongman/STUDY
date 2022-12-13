package boj;
import java.util.*;

public class BOJ10202 { // Longest Subsequence

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int max = 0;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                String str = sc.next();

                if (str.equals("X")) {
                    cnt++;
                } else {
                    cnt = 0;
                }

                if (max < cnt) {
                    max = cnt;
                }
            }

            System.out.printf("The longest contiguous subsequence of X's is of length %d\n", max);
        }

        sc.close();
    }
}