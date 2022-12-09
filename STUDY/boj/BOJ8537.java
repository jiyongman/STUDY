package boj;
import java.util.*;

public class BOJ8537 { // Imiona mrówek

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int max = 0;

        for (int j = 0; j < i; j++) {
            int[] arr = new int[26];
            String str = sc.next();

            for (int k = 0; k < str.length(); k++) {
                arr[str.charAt(k) - 'a']++;
            }

            int cnt = 0;

            for (int k = 0; k < 26; k++) {
                if (arr[k] > 0) {
                    cnt++;
                }
            }

            if (max < cnt) {
                max = cnt;
            }
        }

        System.out.println(max);
        sc.close();
    }
}