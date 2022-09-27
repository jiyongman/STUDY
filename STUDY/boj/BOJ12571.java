package boj;
import java.util.*;

public class BOJ12571 { // Rope Intranet (Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int N = sc.nextInt(); // the number of wires you see
            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }

            int y = 0; // the number of intersection points you see

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if ((A[i] < A[j] && B[i] > B[j]) || (A[i] > A[j] && B[i] < B[j])) {
                        y++;
                    }
                }
            }

            System.out.printf("Case #%d: %d\n", x, y);
        }

        sc.close();
    }
}