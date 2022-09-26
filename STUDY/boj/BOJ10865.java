package boj;
import java.util.*;

public class BOJ10865 { // 친구 친구

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 도현이네 반 학생의 수
        int M = sc.nextInt(); // 친구 관계의 수
        int[] arr = new int[N];

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[A - 1]++;
            arr[B - 1]++;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}