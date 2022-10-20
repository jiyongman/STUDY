package boj;
import java.util.*;

public class BOJ6609 { // 모기곱셈

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int M = sc.nextInt(); // 첫째 주에 있는 모기의 수
            int P = sc.nextInt(); // 첫째 주에 있는 번데기의 수
            int L = sc.nextInt(); // 첫째 주에 있는 유충의 수
            int E = sc.nextInt(); // 한 모기가 낳는 알의 수
            int R = sc.nextInt(); // 살아남는 유충의 비율
            int S = sc.nextInt(); // 살아남는 번데기의 비율
            int N = sc.nextInt(); // 모기 수를 구하려는 시점

            for (int i = 0; i < N; i++) {
                int C = M; // N번째 일요일 후의 모기의 수
                M = P / S;
                P = L / R;
                L = C * E;
            }

            System.out.println(M);
        }

        sc.close();
    }
}