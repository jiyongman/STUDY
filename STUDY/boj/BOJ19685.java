package boj;
import java.util.*;

public class BOJ19685 { // Palindromic FizzBuzz

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long E = sc.nextLong();

        for (long i = S; i <= E; i++) {
            String str = String.valueOf(i);
            int cnt = 0;

            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) == str.charAt(str.length() - 1 - j)) {
                    cnt++;
                }
            }

            if (cnt == str.length() / 2) {
                System.out.println("Palindrome!");
            } else {
                System.out.println(i);
            }
        }

        sc.close();
    }
}