package boj;
import java.util.*;

public class BOJ25501 { // 재귀의 귀재

    public static int cnt;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            String S = sc.next();
            cnt = 0;

            System.out.printf("%d %d\n", isPalindrome(S), cnt);
        }

        sc.close();
    }

    public static int recursion(String S, int l, int r) {

        cnt++;

        if (l >= r) {
            return 1;
        } else if (S.charAt(l) != S.charAt(r)) {
            return 0;
        } else {
            return recursion(S, l + 1, r - 1);
        }
    }

    public static int isPalindrome(String S) {

        return recursion(S, 0, S.length() - 1);
    }
}