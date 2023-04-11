package boj;
import java.util.*;

public class BOJ20977 { // JOI ソート (JOI Sort)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String sorted = "";

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'J') {
                sorted += "J";
            }
        }

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'O') {
                sorted += "O";
            }
        }

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'I') {
                sorted += "I";
            }
        }

        System.out.println(sorted);
        sc.close();
    }
}