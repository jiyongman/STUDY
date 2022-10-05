package boj;
import java.util.*;

public class BOJ10821 { // 정수의 개수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int cnt = 1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ',') {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}