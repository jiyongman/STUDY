package boj;
import java.util.*;

public class BOJ3062 { // 수 뒤집기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int N = Integer.parseInt(str); // 원래 수
            String str2 = "";

            for (int j = str.length() - 1; j >= 0; j--) {
                str2 += str.charAt(j);
            }

            int M = Integer.parseInt(str2); // 뒤집은 수
            int sum = N + M;
            String str3 = Integer.toString(sum);
            int cnt = 0;

            for (int j = 0; j < str3.length() / 2; j++) {
                if (str3.charAt(j) != str3.charAt(str3.length() - 1 - j)) {
                    cnt++;
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