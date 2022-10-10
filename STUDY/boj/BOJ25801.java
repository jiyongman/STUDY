package boj;
import java.util.*;

public class BOJ25801 { // Odd/Even Strings

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        int odd = 0;
        int even = 0;

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i) - 'a'] % 2 > 0) {
                odd++;
            } else {
                even++;
            }
        }

        if (odd == str.length()) {
            System.out.println(1);
        } else if (even == str.length()) {
            System.out.println(0);
        } else {
            System.out.println("0/1");
        }

        sc.close();
    }
}