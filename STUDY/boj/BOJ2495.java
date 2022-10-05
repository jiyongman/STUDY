package boj;
import java.util.*;

public class BOJ2495 { // 연속구간

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int cnt = 1;
            int max = 0;

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    cnt++;
                } else {
                    cnt = 1;
                }

                if (cnt > max) {
                    max = cnt;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}