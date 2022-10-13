package boj;
import java.util.*;

public class BOJ4388 { // 받아올림

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            String str2 = sc.next();

            if (str.equals("0") && str2.equals("0")) {
                break;
            }

            String tmp = "";

            if (str.length() > str2.length()) {
                for (int i = 0; i < str.length() - str2.length(); i++) {
                    tmp += "0";
                }

                tmp += str2;
                str2 = tmp;
            } else if (str.length() < str2.length()) {
                for (int i = 0; i < str2.length() - str.length(); i++) {
                    tmp += "0";
                }

                tmp += str;
                str = tmp;
            }

            int carry = 0;
            int cnt = 0;

            for (int i = str.length() - 1; i >= 0; i--) {
                int a = str.charAt(i) - '0';
                int b = str2.charAt(i) - '0';

                if (a + b >= 10 || (a + b >= 9 && carry > 0)) {
                    carry++;
                    cnt++;
                } else {
                    carry = 0;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}