package boj;
import java.util.*;

public class BOJ2704 { // 이진법 시계

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            String tmp = "";
            int h = Integer.parseInt(str.substring(0, 2));
            String H = Integer.toBinaryString(h);

            if (H.length() < 6) {
                for (int j = 0; j < 6 - H.length(); j++) {
                    tmp += "0";
                }

                tmp += H;
                H = tmp;
                tmp = "";
            }

            int m = Integer.parseInt(str.substring(3, 5));
            String M = Integer.toBinaryString(m);

            if (M.length() < 6) {
                for (int j = 0; j < 6 - M.length(); j++) {
                    tmp += "0";
                }

                tmp += M;
                M = tmp;
                tmp = "";
            }

            int s = Integer.parseInt(str.substring(6));
            String S = Integer.toBinaryString(s);

            if (S.length() < 6) {
                for (int j = 0; j < 6 - S.length(); j++) {
                    tmp += "0";
                }

                tmp += S;
                S = tmp;
            }

            for (int j = 0; j < 6; j++) {
                System.out.printf("%c%c%c", H.charAt(j), M.charAt(j), S.charAt(j));
            }

            System.out.printf(" %s%s%s\n", H, M, S);
        }

        sc.close();
    }
}