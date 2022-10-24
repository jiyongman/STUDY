package boj;
import java.util.*;

public class BOJ6318 { // Box of Bricks

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            int n = sc.nextInt(); // the number of stacks Bob has built

            if (n == 0) {
                break;
            }

            int[] arr = new int[n];
            int sum = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt(); // the heights hi of the n stacks
                sum += arr[j];
            }

            int avg = sum / n;
            int k = 0;

            for (int j = 0; j < n; j++) {
                if (avg < arr[j]) {
                    k += arr[j] - avg;
                }
            }

            System.out.printf("Set #%d\nThe minimum number of moves is %d.\n\n", i, k);
            i++;
        }

        sc.close();
    }
}