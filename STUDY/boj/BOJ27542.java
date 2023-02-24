package boj;
import java.util.*;

public class BOJ27542 { // 絶対階差数列 (Sequence of Absolute Differences)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        while (N > 1) {
            for (int i = 1; i < N; i++) {
                A[i - 1] = Math.abs(A[i - 1] - A[i]);
            }
            N--;
        }

        System.out.println(A[0]);
        sc.close();
    }
}