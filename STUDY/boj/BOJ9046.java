package boj;
import java.util.*;

public class BOJ9046 { // 복호화

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            int[] arr = new int[26];

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != ' ') {
                    arr[str.charAt(j) - 'a']++;
                }
            }

            int max = 0;

            for (int j = 0; j < 26; j++) {
                if (arr[j] >= max) {
                    max = arr[j];
                }
            }

            String str2 = "";

            for (int j = 0; j < 26; j++) {
                if (arr[j] == max) {
                    str2 += (char) (j + 'a');
                }
            }

            if (str2.length() == 1) {
                System.out.println(str2);
            } else {
                System.out.println("?");
            }
        }

        sc.close();
    }
}