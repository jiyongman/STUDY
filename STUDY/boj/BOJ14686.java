package boj;
import java.util.*;

public class BOJ14686 { // Sum Game

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // the number of runs scored by the Swifts
        }

        for (int i = 0; i < N; i++) {
            arr2[i] = sc.nextInt(); // the number of runs scored by the Semaphores
        }

        int sum = 0;
        int sum2 = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            sum += arr[i];
            sum2 += arr2[i];

            if (sum == sum2) {
                result = i + 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}