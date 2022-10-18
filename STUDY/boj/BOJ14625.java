package boj;
import java.util.*;

public class BOJ14625 { // 냉동식품

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 시작시간(시)
        int m = sc.nextInt(); // 종료시간(분)
        int h2 = sc.nextInt(); // 시작시간(시)
        int m2 = sc.nextInt(); // 종료시간(분)
        int n = sc.nextInt(); // 몇 분이 나오는지 알고 싶은 숫자
        int cnt = 0;

        while (true) {
            if (h / 10 == n || h % 10 == n || m / 10 == n || m % 10 == n) {
                cnt++;
            }

            if (h == h2 && m == m2) {
                break;
            }

            m++;

            if (m >= 60) {
                m -= 60;
                h++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}