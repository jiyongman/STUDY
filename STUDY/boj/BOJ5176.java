package boj;
import java.util.*;

public class BOJ5176 { // 대회 자리

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < K; i++) {
            int P = sc.nextInt(); // 참가자의 수
            int M = sc.nextInt(); // 자리의 수
            int[] arr = new int[M];

            for (int j = 0; j < P; j++) {
                int N = sc.nextInt(); // 각 참가자가 원하는 자리가각 참가자가 원하는 자리
                arr[N - 1]++;
            }

            int result = 0;

            for (int j = 0; j < M; j++) {
                if (arr[j] > 1) {
                    result += arr[j] - 1;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}