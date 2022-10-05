package boj;
import java.util.*;

    public class BOJ10539 { // 수빈이와 수열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int[] A = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = B[i] * (i + 1) - sum;
            sum += A[i];

            System.out.print(A[i] + " ");
        }

        sc.close();
    }
}