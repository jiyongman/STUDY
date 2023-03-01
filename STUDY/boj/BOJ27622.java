package boj;
import java.util.*;

public class BOJ27622 { // Suspicious Event

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        boolean[] login = new boolean[1001];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                login[Math.abs(A[i])] = true;
            }
            if (!login[Math.abs(A[i])] && A[i] < 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}