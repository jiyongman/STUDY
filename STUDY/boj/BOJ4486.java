package boj;
import java.util.*;

public class BOJ4486 { // Pencils from the 19th Century

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            int N = sc.nextInt();

            if (N == 0) {
                break;
            }

            System.out.printf("Case %d:\n%d pencils for %d cents\n", i, N, N);
            int cnt = 0;

            for (int j = 1; j < N; j++) {
                for (int k = 1; k < N; k++) {
                    for (int l = 1; l < N; l++) {
                        if (j + k + l == N) {
                            if (4 * j + 0.5 * k + 0.25 * l == N) {
                                System.out.printf("%d at four cents each\n", j);
                                System.out.printf("%d at two for a penny\n", k);
                                System.out.printf("%d at four for a penny\n\n", l);
                                cnt++;
                            }
                        }
                    }
                }
            }

            if (cnt == 0) {
                System.out.printf("No solution found.\n\n");
            }

            i++;
        }

        sc.close();
    }
}