package boj;
import java.util.*;

public class BOJ9056 { // Letter Bank

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            String str2 = sc.next();
            int[] arr = new int[26];
            int[] arr2 = new int[26];

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - 'A'] = 1;
            }

            for (int j = 0; j < str2.length(); j++) {
                arr2[str2.charAt(j) - 'A'] = 1;
            }

            int cnt = 0;

            for (int j = 0; j < 26; j++) {
                if (arr[j] != arr2[j]) {
                    cnt = 1;
                    break;
                }
            }

            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}