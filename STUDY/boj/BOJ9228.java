package boj;
import java.util.*;

public class BOJ9228 { // Check Digits

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            int i = 2;
            int tmp = 0;

            for (int j = str.length() - 1; j >= 0; j--) {
                tmp += (str.charAt(j) - '0') * i;
                i++;
            }

            tmp %= 11;
            tmp = 11 - tmp;
            String str2 = "Rejected";

            if (tmp < 10) {
                System.out.printf("%s -> %d\n", str, tmp);
            } else if (tmp == 10) {
                System.out.printf("%s -> %s\n", str, str2);
            } else {
                System.out.printf("%s -> %d\n", str, 0);
            }
        }

        sc.close();
    }
}