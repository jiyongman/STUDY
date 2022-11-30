package boj;
import java.util.*;

public class BOJ6992 { // Arithmetic Sequence

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int d = arr[1] - arr[0];
            int cnt = 0;

            for (int j = 1; j < n; j++) {
                if (arr[j] != arr[j - 1] + d) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.print("The next 5 numbers after [");

                for (int j = 0; j < n - 1; j++) {
                    System.out.printf("%d, ", arr[j]);
                }

                System.out.printf("%d] are: [%d, %d, %d, %d, %d]\n", arr[n - 1], arr[n - 1] + d, arr[n - 1] + 2 * d, arr[n - 1] + 3 * d, arr[n - 1] + 4 * d, arr[n - 1] + 5 * d);
            } else {
                System.out.print("The sequence [");

                for (int j = 0; j < n - 1; j++) {
                    System.out.printf("%d, ", arr[j]);
                }

                System.out.printf("%d] is not an arithmetic sequence.\n", arr[n - 1]);
            }
        }

        sc.close();
    }
}