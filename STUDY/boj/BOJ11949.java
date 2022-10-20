package boj;
import java.util.*;

public class BOJ11949 { // 번호표 교환

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생의 수
        int M = sc.nextInt(); // 카드의 수
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // 각 학생이 가지는 번호표의 값
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (A[j] % (i + 1) > A[j + 1] % (i + 1)) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }

        sc.close();
    }
}