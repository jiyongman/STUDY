package boj;
import java.util.*;

public class BOJ26714 { // Liczenie punktów

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int result = 0;

        for (int i = 0; i < n; i += n / 10) {
            int cnt = 0;

            for (int j = i; j < i + n / 10; j++) {
                if (str.charAt(j) == 'T') {
                    cnt++;
                }
            }

            if (cnt == n / 10) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}