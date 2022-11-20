package boj;
import java.util.*;

public class BOJ26004 { // HI-ARC

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문자열 S의 길이
        String S = sc.next();
        int h = 0;
        int i = 0;
        int a = 0;
        int r = 0;
        int c = 0;

        for (int j = 0; j < N; j++) {
            if (S.charAt(j) == 'H') {
                h++;
            } else if (S.charAt(j) == 'I') {
                i++;
            } else if (S.charAt(j) == 'A') {
                a++;
            } else if (S.charAt(j) == 'R') {
                r++;
            } else if (S.charAt(j) == 'C') {
                c++;
            }
        }

        int result = Math.min(h, Math.min(i, Math.min(a, Math.min(r, c))));

        System.out.println(result);
        sc.close();
    }
}