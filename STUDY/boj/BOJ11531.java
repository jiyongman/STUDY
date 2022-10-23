package boj;
import java.util.*;

public class BOJ11531 { // ACM 대회 채점

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int cnt = 0;
        int result = 0;

        while (true) {
            int m = sc.nextInt();

            if (m == -1) {
                break;
            }

            String str = sc.next();
            String str2 = sc.next();

            if (str2.equals("right")) {
                cnt++;
                result += m + 20 * arr[str.charAt(0) - 'A'];
            }

            arr[str.charAt(0) - 'A']++;
        }

        System.out.printf("%d %d", cnt, result);
        sc.close();
    }
}