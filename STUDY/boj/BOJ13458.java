package boj;
import java.util.*;

public class BOJ13458 { // 시험 감독

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 시험장의 개수
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // 각 시험장에 있는 응시자의 수
        }

        int B = sc.nextInt(); // 총감독관이 한 시험장에서 감시할 수 있는 응시자의 수
        int C = sc.nextInt(); // 부감독관이 한 시험장에서 감시할 수 있는 응시자의 수
        long cnt = 0;

        for (int i = 0; i < N; i++) {
            A[i] -= B;
            cnt++;

            if (A[i] <= 0) {
                continue;
            }

            if (A[i] % C == 0) {
                cnt += A[i] / C;
            } else {
                cnt += A[i] / C + 1;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}