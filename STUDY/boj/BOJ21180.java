package boj;
import java.util.*;

public class BOJ21180 { // Reconstruct Sum

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of integers on the whiteboard
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (sum - arr[i] == arr[i]) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println("BAD");
        sc.close();
    }
}