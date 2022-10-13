package boj;
import java.util.*;

public class BOJ16172 { // 나는 친구가 적다 (Large)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray(); // 알파벳 소문자, 대문자, 숫자로 이루어진 문자열
        char[] K = sc.next().toCharArray(); // 성민이가 찾고자 하는 알파벳 소문자, 대문자로만 이루어진 키워드 문자열
        int[] pi = new int[K.length];
        int j = 0;

        for (int i = 1; i < K.length; i++) {
            while (j > 0 && K[i] != K[j]) {
                j = pi[j - 1];
            }

            if (K[i] == K[j]) {
                pi[i] = ++j;
            }
        }

        j = 0;

        for (int i = 0; i < S.length; i++) {
            if (S[i] >= '0' && S[i] <= '9') {
                continue;
            }

            while (j > 0 && S[i] != K[j]) {
                j = pi[j - 1];
            }

            if (S[i] == K[j]) {
                if (++j == K.length) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
        sc.close();
    }
}