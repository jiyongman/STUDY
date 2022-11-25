package boj;
import java.util.*;

public class BOJ4974 { // ICPC Score Totalizer Software

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int sum = 0;

            for (int i = 1; i < n - 1; i++) {
                sum += arr[i];
            }

            int avg = sum / (n - 2);

            System.out.println(avg);
        }

        sc.close();
    }
}