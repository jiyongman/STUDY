package boj;
import java.util.*;

public class BOJ10203 { // Count Vowels

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            String w = sc.next();
            int cnt = 0;

            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    cnt++;
                }
            }

            System.out.printf("The number of vowels in %s is %d.\n", w, cnt);
        }

        sc.close();
    }
}