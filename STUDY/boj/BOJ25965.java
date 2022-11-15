package boj;
import java.util.*;

public class BOJ25965 { // 미션 도네이션

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 총 게임의 수

        for (int i = 0; i < N; i++) {
            int M = sc.nextInt(); // 총 미션의 수
            long[] K = new long[M];
            long[] D = new long[M];
            long[] A = new long[M];

            for (int j = 0; j < M; j++) {
                K[j] = sc.nextLong(); // 킬당 추가해야 하는 금액
                D[j] = sc.nextLong(); // 데스당 차감해야 하는 금액
                A[j] = sc.nextLong(); // 어시스트당 추가해야 하는 금액
            }

            long k = sc.nextLong(); // 순범이의 킬
            long d = sc.nextLong(); // 순범이의 데스
            long a = sc.nextLong(); // 순범이의 어시스트
            long result = 0;

            for (int j = 0; j < M; j++) {
                long sum = K[j] * k - (D[j] * d) + A[j] * a;

                if (sum >= 0) {
                    result += sum;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}