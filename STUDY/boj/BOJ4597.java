package boj;
import java.util.*;

public class BOJ4597 { // 패리티

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next(); // 비트 스트링

            if (str.equals("#")) {
                break;
            }

            int cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    cnt++;
                }
            }

            if (cnt % 2 > 0) {
                if (str.charAt(str.length() - 1) == 'o') {
                    str = str.replace('o', '0');
                } else {
                    str = str.replace('e', '1');
                }
            } else {
                if (str.charAt(str.length() - 1) == 'o') {
                    str = str.replace('o', '1');
                } else {
                    str = str.replace('e', '0');
                }
            }

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }

            System.out.println();
        }

        sc.close();
    }
}