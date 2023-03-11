package boj;
import java.util.*;

public class BOJ26416 { // New Password

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x = 1; x <= T; x++) {
            int N = sc.nextInt();
            String password = sc.next();
            boolean uppercase = false;
            boolean lowercase = false;
            boolean digit = false;
            boolean special = false;

            for (int i = 0; i < N; i++) {
                char ch = password.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    uppercase = true;
                }

                if (ch >= 'a' && ch <= 'z') {
                    lowercase = true;
                }

                if (ch >= '0' && ch <= '9') {
                    digit = true;
                }

                if (ch == '#' || ch == '@' || ch == '*' || ch == '&') {
                    special = true;
                }
            }

            if (!uppercase) {
                password += 'A';
            }

            if (!lowercase) {
                password += 'a';
            }

            if (!digit) {
                password += '0';
            }

            if (!special) {
                password += '#';
            }

            while (password.length() < 7) {
                password += 'A';
            }

            System.out.printf("Case #%d: %s\n", x, password);
        }

        sc.close();
    }
}