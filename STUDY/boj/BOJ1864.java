package boj;
import java.util.*;

public class BOJ1864 { // 문어 숫자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next(); // 문어 숫자

            if (str.equals("#")) {
                break;
            }

            int n = 0;
            int result = 0;
            int tmp = str.length() - 1;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-') {
                    n = 0;
                } else if (str.charAt(i) == '\\') {
                    n = 1;
                } else if (str.charAt(i) == '(') {
                    n = 2;
                } else if (str.charAt(i) == '@') {
                    n = 3;
                } else if (str.charAt(i) == '?') {
                    n = 4;
                } else if (str.charAt(i) == '>') {
                    n = 5;
                } else if (str.charAt(i) == '&') {
                    n = 6;
                } else if (str.charAt(i) == '%') {
                    n = 7;
                } else if (str.charAt(i) == '/') {
                    n = -1;
                }

                result += n * Math.pow(8, tmp);
                tmp--;
            }

            System.out.println(result);

        }

        sc.close();
    }
}