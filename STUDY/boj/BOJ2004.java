package boj;
import java.util.*;

public class BOJ2004 { // 조합 0의 개수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt_power_2 = cnt_power(n, 2) - cnt_power(m, 2) - cnt_power(n - m, 2);
        int cnt_power_5 = cnt_power(n, 5) - cnt_power(m, 5) - cnt_power(n - m, 5);

        System.out.println(Math.min(cnt_power_2, cnt_power_5));
        sc.close();
    }

    public static int cnt_power(int num, int base) {

        int cnt = 0;

        while (num >= base) {
            cnt += num / base;
            num /= base;
        }

        return cnt;
    }
}