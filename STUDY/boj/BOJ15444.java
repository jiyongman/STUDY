package boj;
import java.util.*;

public class BOJ15444 { // Vera and ABCDE

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        for (int i = 0; i < N; i++) {
            System.out.print("***");
        }

        System.out.println();

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'C' || S.charAt(i) == 'E') {
                System.out.print("*..");
            } else {
                System.out.print("*.*");
            }
        }

        System.out.println();

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'C') {
                System.out.print("*..");
            } else if (S.charAt(i) == 'D') {
                System.out.print("*.*");
            } else {
                System.out.print("***");
            }
        }

        System.out.println();

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'C' || S.charAt(i) == 'E') {
                System.out.print("*..");
            } else {
                System.out.print("*.*");
            }
        }

        System.out.println();

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'A') {
                System.out.print("*.*");
            } else {
                System.out.print("***");
            }
        }

        sc.close();
    }
}