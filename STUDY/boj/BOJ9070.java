package boj;
import java.util.*;

public class BOJ9070 { // 장보기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 맛살의 종류
            double min = 21;
            double result = 0;

            for (int j = 0; j < N; j++) {
                double W = sc.nextDouble(); // 맛살의 중량
                double C = sc.nextDouble(); // 맛살의 가격
                double K = C / W; // 중량 당 가격

                if (min > K) {
                    min = K;
                    result = C;
                } else if (min == K) {
                    result = Math.min(result, C);
                }
            }

            System.out.println((int) result);
        }

        sc.close();
    }
}