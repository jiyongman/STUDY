package boj;
import java.util.*;

public class BOJ11091 { // 알파벳 전부 쓰기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine().toLowerCase();
            int[] arr = new int[26];

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
                    arr[str.charAt(j) - 'a']++;
                }
            }

            int cnt = 0;
            String str2 = "";

            for (int j = 0; j < 26; j++) {
                if (arr[j] > 0) {
                    cnt++;
                } else {
                    str2 += (char) (j + 'a');
                }
            }

            if (cnt == 26) {
                System.out.println("pangram");
            } else {
                System.out.printf("missing %s\n", str2);
            }
        }

        sc.close();
    }
}