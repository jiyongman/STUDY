package boj;
import java.util.*;

public class BOJ9883 { // Morton Numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String tmp = Integer.toBinaryString(x);
        String str = "";

        for (int i = 0; i < 16 - tmp.length(); i++) {
            str += "0";
        }

        str += tmp;
        tmp = Integer.toBinaryString(y);
        String str2 = "";

        for (int i = 0; i < 16 - tmp.length(); i++) {
            str2 += "0";
        }

        str2 += tmp;
        tmp = "";

        for (int i = 0; i < 16; i++) {
            tmp += str.charAt(i);
            tmp += str2.charAt(i);
        }

        long result = 0;
        long tmp2 = 1;

        for (int i = 31; i >= 0; i--) {
            if (tmp.charAt(i) == '1') {
                result += tmp2;
            }

            tmp2 *= 2;
        }

        System.out.println(result);
        sc.close();
    }
}