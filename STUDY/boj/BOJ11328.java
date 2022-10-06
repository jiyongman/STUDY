package boj;
import java.util.*;

public class BOJ11328 { // Strfry

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            String str2 = sc.next();
            int[] arr = new int[26];
            int[] arr2 = new int[26];

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - 'a']++;
            }

            for (int j = 0; j < str2.length(); j++) {
                arr2[str2.charAt(j) - 'a']++;
            }

            int cnt = 0;

            for (int j = 0; j < 26; j++) {
                if (arr[j] != arr2[j]) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }

        sc.close();
    }
}