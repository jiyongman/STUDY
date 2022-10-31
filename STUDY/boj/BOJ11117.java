package boj;
import java.util.*;

public class BOJ11117 { // Letter Cookies

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of letter cookie boxes your sister has

        for (int i = 0; i < T; i++) {
            String W = sc.next(); // the number of words she would like to spell
            int[] arr = new int[26];

            for (int j = 0; j < W.length(); j++) {
                arr[W.charAt(j) - 'A']++;
            }

            int N = sc.nextInt();

            for (int j = 0; j < N; j++) {
                String S = sc.next();
                int[] arr2 = new int[26];

                for (int k = 0; k < S.length(); k++) {
                    arr2[S.charAt(k) - 'A']++;
                }

                int cnt = 0;

                for (int k = 0; k < 26; k++) {
                    if (arr[k] >= arr2[k]) {
                        cnt++;
                    }
                }

                if (cnt == 26) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}