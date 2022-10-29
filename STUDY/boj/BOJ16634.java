package boj;
import java.util.*;

public class BOJ16634 { // Run-Length Encoding, Run!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        if (str.equals("E")) {
            int cnt = 1;

            System.out.print(str2.charAt(0));

            for (int i = 1; i < str2.length(); i++) {
                if (str2.charAt(i - 1) != str2.charAt(i)) {
                    System.out.printf("%d%c", cnt, str2.charAt(i));
                    cnt = 1;
                } else {
                    cnt++;
                }
            }

            System.out.print(cnt);
        } else {
            for (int i = 0; i < str2.length(); i += 2) {
                for (int j = 0; j < str2.charAt(i + 1) - '0'; j++) {
                    System.out.print(str2.charAt(i));
                }
            }
        }

        sc.close();
    }
}