package boj;
import java.util.*;

public class BOJ15814 { // 야바위 대장

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            char tmp = S[A];
            S[A] = S[B];
            S[B] = tmp;
        }

        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i]);
        }

        sc.close();
    }
}