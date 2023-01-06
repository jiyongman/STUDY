package boj;
import java.util.*;

public class BOJ24820 { // Spelling Bee

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String spelling_bee = sc.next(); // 7 distinct lowercase English letters
        int n = sc.nextInt(); // the size of the dictionary
        int[] spelling_bee_arr = new int[26];

        for (int i = 0; i < 7; i++) {
            spelling_bee_arr[spelling_bee.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            String l = sc.next(); // the lowercase English letters
            int[] l_arr = new int[26];

            for (int j = 0; j < l.length(); j++) {
                l_arr[l.charAt(j) - 'a']++;
            }

            int cnt = 0;

            for (int j = 0; j < 26; j++) {
                if (spelling_bee_arr[j] > 0 && spelling_bee_arr[j] <= l_arr[j]) {
                    cnt += l_arr[j] - spelling_bee_arr[j] + 1;
                }
            }

            char ch = spelling_bee.charAt(0);

            if (cnt == l.length() && l.length() >= 4 && l_arr[ch - 'a'] > 0) {
                System.out.println(l);
            }
        }

        sc.close();
    }
}