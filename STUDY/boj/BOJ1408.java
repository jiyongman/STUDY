package boj;
import java.util.*;

public class BOJ1408 { // 24

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 현재 시간
        String str2 = sc.next(); // 도현이가 임무를 시작한 시간
        int t = Integer.parseInt(str.substring(0, 2)) * 3600 + Integer.parseInt(str.substring(3, 5)) * 60 + Integer.parseInt(str.substring(6));
        int t2 = Integer.parseInt(str2.substring(0, 2)) * 3600 + Integer.parseInt(str2.substring(3, 5)) * 60 + Integer.parseInt(str2.substring(6));
        int h = (t2 - t) / 3600;
        int m = (t2 - t) / 60 % 60;
        int s = (t2 - t) % 60;

        if (s < 0) {
            s += 60;
            m--;
        }

        if (m < 0) {
            m += 60;
            h--;
        }

        if (h < 0) {
            h += 24;
        }

        System.out.printf("%02d:%02d:%02d", h, m, s);
        sc.close();
    }
}