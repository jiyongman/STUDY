package boj;
import java.util.*;

public class BOJ27627 { // Splitology

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        for (int i = 0; i < S.length(); i++) {
            String A = S.substring(0, i);
            String B = S.substring(i);
            boolean palindrome = true;
            boolean palindrome2 = true;

            for (int j = 0; j < A.length() / 2; j++) {
                if (A.charAt(j) != A.charAt(A.length() - 1 - j)) {
                    palindrome = false;
                }
            }

            for (int j = 0; j < B.length() / 2; j++) {
                if (B.charAt(j) != B.charAt(B.length() - 1 - j)) {
                    palindrome2 = false;
                }
            }

            if (B.equals(S)) {
                palindrome2 = false;
            }

            if (palindrome && palindrome2) {
                System.out.printf("%s %s", A, B);
                return;
            }
        }

        System.out.println("NO");
        sc.close();
    }
}