package boj;
import java.util.*;

public class BOJ10420 { // 기념일 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int y = 2014;
        int m = 4;
        int d = 1;

        for (int i = 0; i < N; i++) {
            d++;

            if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d > 31) {
                m++;
                d = 1;
            } else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
                m++;
                d = 1;
            } else if (m == 2 && d > 29 && (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))) {
                m++;
                d = 1;
            } else if (m == 2 && d > 28 && !(y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))) {
                m++;
                d = 1;
            }

            if (m > 12) {
                y++;
                m = 1;
            }
        }

        System.out.printf("%04d-%02d-%02d", y, m, d);
        sc.close();
    }
}