package boj;
import java.util.*;

public class BOJ7600 { // 문자가 몇갤까

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine().toLowerCase();

            if (str.equals("#")) {
                break;
            }

            int[] arr = new int[26];

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    arr[str.charAt(i) - 'a']++;
                }
            }

            int cnt = 0;

            for (int i = 0; i < 26; i++) {
                if (arr[i] > 0) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}