package boj;
import java.util.*;

public class BOJ3943 { // 헤일스톤 수열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // 헤일스톤 수열의 시작값
            int max = n;

            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }

                max = Math.max(max, n);
            }

            System.out.println(max);
        }

        sc.close();
    }
}