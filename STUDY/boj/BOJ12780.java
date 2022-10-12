package boj;
import java.util.*;

public class BOJ12780 { // 원피스

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String H = sc.next(); // 해적단이 획득한 단서의 문자열
        String N = sc.next(); // 진아가 H에서 등장 횟수를 알고 싶은 문자열
        int cnt = 0;

        for (int i = 0; i <= H.length() - N.length(); i++) {
            if (H.substring(i, i + N.length()).equals(N)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}