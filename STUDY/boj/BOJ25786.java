package boj;
import java.util.*;

public class BOJ25786 { // Decimal XOR

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
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

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) - '0' <= 2 && str2.charAt(i) - '0' <= 2) || (str.charAt(i) - '0' >= 7 && str2.charAt(i) - '0' >= 7)) {
                System.out.print(0);
            } else {
                System.out.print(9);
            }
        }

        sc.close();
    }
}