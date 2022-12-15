package boj;
import java.util.*;

public class BOJ26201 { // Finding Maximal Non-Trivial Monotones

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int cnt = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 'a') {
                cnt++;
            } else {
                if (cnt > 1) {
                    result += cnt;
                }

                cnt = 0;
            }
        }

        if (cnt > 1) {
            result += cnt;
        }

        System.out.println(result);
        sc.close();
    }
}