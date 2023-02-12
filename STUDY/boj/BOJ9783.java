package boj;
import java.util.*;

public class BOJ9783 { // Easy Encryption

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                System.out.printf("%02d", ch - 'a' + 1);
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.print(ch - 'A' + 27);
            } else if (ch >= '0' && ch <= '9') {
                System.out.printf("#%d", ch - '0');
            } else {
                System.out.print(ch);
            }
        }

        sc.close();
    }
}