package boj;
import java.util.*;

public class BOJ6081 { // Hay Expenses

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of days
        int Q = sc.nextInt(); // the number of queries
        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt(); // hay bale counts
        }

        for (int i = 0; i < Q; i++) {
            int S = sc.nextInt(); // start
            int E = sc.nextInt(); // end
            int sum = 0;

            for (int j = S; j <= E; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }

        sc.close();
    }
}