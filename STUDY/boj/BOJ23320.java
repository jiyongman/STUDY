package boj;
import java.util.*;

public class BOJ23320 { // 홍익 절대평가

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 시험을 응시한 학생의 수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 학생의 점수
        }

        int X = sc.nextInt(); // 상대평가 시 A학점의 비율
        int Y = sc.nextInt(); // 절대평가 시 A학점을 받기 위한 최소 점수
        int A = N * X / 100; // 상대평가 시 A학점을 받는 인원의 수
        int B = 0; // 절대평가 시 A학점을 받는 인원의 수

        for (int i = 0; i < N; i++) {
            if (arr[i] >= Y) {
                B++;
            }
        }

        System.out.printf("%d %d", A, B);
        sc.close();
    }
}