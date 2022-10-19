package boj;
import java.util.*;

public class BOJ15874 { // Caesar Cipher

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int k = Integer.parseInt(st.nextToken()); // 다음 알파벳으로 밀 횟수
        int n = Integer.parseInt(st.nextToken()); // 문자열 s의 길이
        char[] s = sc.nextLine().toCharArray();
        k %= 26;

        for (int i = 0; i < n; i++) {
            if (s[i] >= 'a' && s[i] <= 'z') {
                s[i] += k;

                if (s[i] > 'z') {
                    s[i] -= 26;
                }
            } else if (s[i] >= 'A' && s[i] <= 'Z') {
                s[i] += k;

                if (s[i] > 'Z') {
                    s[i] -= 26;
                }
            }

            System.out.print(s[i]);
        }

        sc.close();
    }
}