package boj;
import java.util.*;

public class BOJ6359 { // 만취한 상범

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // 방의 개수
            int cnt = 0;

            for (int j = 1; j <= n; j++) {
                if (Math.sqrt(j) % 1 == 0) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}