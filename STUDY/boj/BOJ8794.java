package boj;
import java.util.*;

public class BOJ8794 { // Poniedziałki

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Z = sc.nextInt(); // the number of test sets

        for (int i = 0; i < Z; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int L = sc.nextInt();

            if (L == 1) {
                if (N % M == 0) {
                    System.out.println(N / M);
                } else {
                    System.out.println(N / M + 1);
                }
            } else {
                N -= (M - (L - 1));

                if (N % M == 0) {
                    System.out.println(N / M);
                } else {
                    System.out.println(N / M + 1);
                }
            }
        }

        sc.close();
    }
}