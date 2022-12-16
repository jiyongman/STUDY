package boj;
import java.util.*;

public class BOJ12184 { // GBus count (Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int N = sc.nextInt(); // the number of GBuses
            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }

            int P = sc.nextInt(); // the number of cities
            int[] C = new int[P];

            System.out.printf("Case #%d: ", x);

            for (int i = 0; i < P; i++) {
                C[i] = sc.nextInt();
                int cnt = 0;

                for (int j = 0; j < N; j++) {
                    if (C[i] >= A[j] && C[i] <= B[j]) {
                        cnt++;
                    }
                }

                System.out.printf("%d ", cnt);
            }

            System.out.println();
        }

        sc.close();
    }
}