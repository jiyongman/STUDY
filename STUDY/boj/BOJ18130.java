package boj;
import java.util.*;

public class BOJ18130 { // 여름나기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 진열된 손 선풍기의 개수
        int Q = sc.nextInt(); // 현석이가 집까지 가는데 걸어가는 시간
        long min = Long.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < N; i++) {
            long P = sc.nextLong(); // 손 선풍기의 가격
            long K = sc.nextLong(); // 추가비용을 내야 하는 시간 간격
            long C = sc.nextLong(); // 추가비용의 초기값
            long X = (Q - 1) / K;
            long sum = P + (X * (X + 1) / 2) * C;

            if (min > sum) {
                min = sum;
                result = i + 1;
            }
        }

        System.out.printf("%d %d", result, min);
        sc.close();
    }
}