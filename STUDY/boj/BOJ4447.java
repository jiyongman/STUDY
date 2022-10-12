package boj;
import java.util.*;

public class BOJ4447 { // 좋은놈 나쁜놈

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // 테스트 케이스

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine(); // 히어로의 이름
            int cnt = 0;
            int cnt2 = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'g' || str.charAt(j) == 'G') {
                    cnt++;
                } else if (str.charAt(j) == 'b' || str.charAt(j) == 'B') {
                    cnt2++;
                }
            }

            String str2 = "";

            if (cnt > cnt2) {
                str2 += "GOOD";
            } else if (cnt < cnt2) {
                str2 += "A BADDY";
            } else {
                str2 += "NEUTRAL";
            }

            System.out.printf("%s is %s\n", str, str2);
        }

        sc.close();
    }
}