package boj;
import java.util.*;

public class BOJ4580 { // Mad Scientist

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int k = sc.nextInt();

            if (k == 0) {
                break;
            }

            int[] P_sequence = new int[k + 1];
            P_sequence[0] = 0;

            for (int i = 1; i <= k; i++) {
                P_sequence[i] = sc.nextInt();
            }

            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < P_sequence[i] - P_sequence[i - 1]; j++) {
                    System.out.printf("%d ", i);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}