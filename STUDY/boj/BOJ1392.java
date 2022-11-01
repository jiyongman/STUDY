package boj;
import java.util.*;

public class BOJ1392 { // 노래 악보

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 악보 수
        int Q = sc.nextInt(); // 질문의 개수
        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt(); // 각 악보가 차지하는 시간(초)
        }

        for (int i = 0; i < Q; i++) {
            int K = sc.nextInt(); // 알고자 하는 Q개의 시간(초)

            for (int j = 1; j <= N; j++) {
                if (arr[j] > K) {
                    System.out.println(j);
                    break;
                }

                K -= arr[j];
            }
        }

        sc.close();
    }
}