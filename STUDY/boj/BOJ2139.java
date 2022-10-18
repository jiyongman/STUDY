package boj;
import java.util.*;

public class BOJ2139 { // 나는 너가 살아온 날을 알고 있다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int d = sc.nextInt(); // 일
            int m = sc.nextInt(); // 월
            int y = sc.nextInt(); // 년
            int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (d == 0 && m == 0 && y == 0) {
                break;
            }

            if (y % 4 == 0 && (y % 400 == 0 || y % 100 != 0)) {
                arr[2] = 29;
            }

            int day = 0;

            for (int i = 0; i < m; i++) {
                day += arr[i];
            }

            day += d;

            System.out.println(day);
        }

        sc.close();
    }
}