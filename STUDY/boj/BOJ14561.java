package boj;
import java.util.*;

public class BOJ14561 { // 회문

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            long A = sc.nextLong(); // 어떤 십진수의 수
            int n = sc.nextInt(); // n진수
            String str = Long.toString(A, n);
            int cnt = 0;

            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}