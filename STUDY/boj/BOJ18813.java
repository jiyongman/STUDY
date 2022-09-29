package boj;
import java.util.*;

public class BOJ18813 { // Divisionals Spelling

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of words in Emilio’s list
        int m = sc.nextInt(); // the number of questions in the contest
        int result = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int[] arr = new int[26];
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - 'A']++;
            }

            for (int j = 0; j < str.length(); j++) {
                if (arr[str.charAt(j) - 'A'] == 1 && str.charAt(j) < 'A' + m) {
                    cnt++;
                }
            }

            if (cnt == str.length()) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}