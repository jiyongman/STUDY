package boj;
import java.util.*;

public class BOJ1942 { // 디지털시계

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String str = sc.next(); // 시작하는 시각
            String str2 = sc.next(); // 끝나는 시각
            int t = Integer.parseInt(str.substring(0, 2)) * 10000 + Integer.parseInt(str.substring(3, 5)) * 100 + Integer.parseInt(str.substring(6));
            int t2 = Integer.parseInt(str2.substring(0, 2)) * 10000 + Integer.parseInt(str2.substring(3, 5)) * 100 + Integer.parseInt(str2.substring(6));

            if (t2 - t < 0) {
                t2 += 240000;
            }

            int cnt = 0;

            for (int j = t; j <= t2; j++) {
                if (j % 100 >= 60) {
                    j -= 60;
                    j += 100;
                }

                if (j / 100 % 100 >= 60) {
                    j -= 6000;
                    j += 10000;
                }

                if (j % 3 == 0) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}