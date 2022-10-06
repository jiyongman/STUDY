package boj;
import java.util.*;

public class BOJ2804 { // 크로스워드 만들기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int N = 0;
        int M = 0;
        int cnt = 0;

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    N = i;
                    M = j;
                    cnt++;
                    break;
                }
            }
            if (cnt == 1) {
                break;
            }
        }

        for (int i = 0; i < B.length(); i++) {
            for (int j = 0; j < A.length(); j++) {
                if (i == M) {
                    System.out.print(A.charAt(j));
                } else if (j == N) {
                    System.out.print(B.charAt(i));
                } else {
                    System.out.print(".");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}