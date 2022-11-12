package boj;
import java.util.*;

public class BOJ14969 { // Taro's Shopping

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] <= m) {
                        int sum = arr[i] + arr[j];
                        max = Math.max(max, sum);
                    }
                }
            }

            if (max > 0) {
                System.out.println(max);
            } else {
                System.out.println("NONE");
            }
        }

        sc.close();
    }
}