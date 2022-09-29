package boj;
import java.util.*;

public class BOJ25495 { // 에어팟

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 에어팟에 핸드폰의 연결한 횟수
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // 각 차례에 연결한 핸드폰 종류
        }

        int before = 0;
        int sum = 2;
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] == before) {
                sum *= 2;
            } else {
                sum = 2;
            }

            result += sum;
            before = A[i];

            if (result >= 100) {
                before = 0;
                sum = 2;
                result = 0;
            }
        }

        System.out.println(result);
        sc.close();
    }
}