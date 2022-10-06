package boj;
import java.util.*;

public class BOJ16916 { // 부분 문자열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        char[] P = sc.next().toCharArray();
        int[] pi = new int[P.length];
        int j = 0;

        for (int i = 1; i < P.length; i++) {
            while (j > 0 && P[i] != P[j]) {
                j = pi[j - 1];
            }

            if (P[i] == P[j]) {
                pi[i] = ++j;
            }
        }

        j = 0;

        for (int i = 0; i < S.length; i++) {
            while (j > 0 && S[i] != P[j]) {
                j = pi[j - 1];
            }

            if (S[i] == P[j]) {
                if (++j == P.length) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
        sc.close();
    }
}