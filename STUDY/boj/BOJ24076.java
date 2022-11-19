package boj;
import java.util.*;

public class BOJ24076 { // IOI 文字列 (IOI String)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                if (S.charAt(i) != 'I') {
                    cnt++;
                }
            } else {
                if (S.charAt(i) != 'O') {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
