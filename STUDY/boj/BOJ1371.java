package boj;
import java.util.*;

public class BOJ1371 { // 가장 많은 글자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];

        while (sc.hasNext()) {
            String str = sc.nextLine(); // 글의 문장

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    continue;
                }

                arr[str.charAt(i) - 'a']++;
            }
        }

        int max = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        String str = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}