package boj;
import java.util.*;

public class BOJ25870 { // Parity of Strings

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        int odd = 0;
        int even = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 > 0) {
                    odd++;
                } else {
                    even++;
                }
            }
        }

        if (odd == 0 && even > 0) {
            System.out.println(0);
        } else if (odd > 0 && even == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        sc.close();
    }
}