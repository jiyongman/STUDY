package boj;
import java.util.*;

public class BOJ24088 { // 運動会 (Sports Day)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) == 'R') {
                K--;
            }
        }

        if (K == 0) {
            System.out.println("W");
        } else {
            System.out.println("R");
        }

        sc.close();
    }
}