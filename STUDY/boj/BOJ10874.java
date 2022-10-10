package boj;
import java.util.*;

public class BOJ10874 { // 이교수님의 시험

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 시험을 본 학생 수
        int[] arr = new int[10];

        for (int i = 0; i < N; i++) {
            int cnt = 0;

            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt(); // 학생이 고른 j번째 문제의 답

                if ((arr[j] - 1) % 5 == j % 5) {
                    cnt++;
                }
            }

            if (cnt == 10) {
                System.out.println(i + 1);
            }
        }

        sc.close();
    }
}