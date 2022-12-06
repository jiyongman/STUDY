package boj;
import java.util.*;

public class BOJ13587 { // huaauhahhuahau

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str2 += ch;
            }
        }

        for (int i = 0; i < str2.length() / 2; i++) {
            if (str2.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
                System.out.println("N");
                return;
            }
        }

        System.out.println("S");
        sc.close();
    }
}