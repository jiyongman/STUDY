package boj;
import java.util.*;

public class BOJ12813 { // 이진수 연산

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1' && B.charAt(i) == '1') {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

        System.out.println();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1' || B.charAt(i) == '1') {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

        System.out.println();

        for (int i = 0; i < A.length(); i++) {
            if ((A.charAt(i) == '0' && B.charAt(i) == '1') || (A.charAt(i) == '1' && B.charAt(i) == '0')) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

        System.out.println();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0') {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

        System.out.println();

        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == '0') {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

        sc.close();
    }
}