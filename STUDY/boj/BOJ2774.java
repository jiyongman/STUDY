package boj;
import java.util.*;

public class BOJ2774 { // 아름다운 수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(); // 아름다운 정도를 알고 싶은 수
            int[] arr = new int[10];

            while (X > 0) {
                arr[X % 10]++;
                X /= 10;
            }

            int cnt = 0;

            for (int j = 0; j < 10; j++) {
                if (arr[j] > 0) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}