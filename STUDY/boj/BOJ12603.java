package boj;
import java.util.*;

public class BOJ12603 { // Store Credit (Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= N; x++) {
            int C = sc.nextInt(); // the amount of credit you have at the store
            int I = sc.nextInt(); // the number of items in the store
            int[] arr = new int[I + 1];

            for (int i = 1; i <= I; i++) {
                arr[i] = sc.nextInt(); // the price of an item in the store
            }

            int a = 0;
            int b = 0;

            for (int i = 1; i <= I - 1; i++) {
                for (int j = i + 1; j <= I; j++) {
                    if (arr[i] + arr[j] == C) {
                        a = i;
                        b = j;
                    }
                }
            }

            System.out.printf("Case #%d: %d %d\n", x, a, b);
        }

        sc.close();
    }
}
