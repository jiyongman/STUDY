package boj;
import java.util.*;

public class BOJ10834 { // 벨트

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 벨트의 개수
        int cnt = 0; // 바퀴의 회전 방향
        int result = 1; // 분당 회전수

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt(); // 바퀴가 회전하는 횟수
            int b = sc.nextInt(); // 바퀴가 회전하는 횟수
            int s = sc.nextInt(); // 벨트의 형태
            result = result / a * b;

            if (s == 1) {
                if (cnt == 0) {
                    cnt = 1;
                } else {
                    cnt = 0;
                }
            }
        }

        System.out.printf("%d %d", cnt, result);
        sc.close();
    }
}