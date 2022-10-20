package boj;
import java.util.*;

public class BOJ14551 { // Card Game Contest

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 1;

        if (N == 0 && M == 1) {
            result = 0;
        }

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();

            if (A == 0) {
                A = 1;
            }

            result *= A;
            result %= M;
        }

        System.out.println(result);
        sc.close();
    }
}