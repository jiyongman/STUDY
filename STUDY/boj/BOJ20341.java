package boj;
import java.util.*;

public class BOJ20341 { // Moderate Pace

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of days of training
        int[] k = new int[n];

        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt(); // your ideal daily distances
        }

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // your first colleague's ideal daily distances
        }

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt(); // your second colleague's ideal daily distances
        }

        int[] arr = new int[3];

        for (int i = 0; i < n; i++) {
            arr[0] = k[i];
            arr[1] = a[i];
            arr[2] = b[i];

            Arrays.sort(arr);

            System.out.printf("%d ", arr[1]);
        }

        sc.close();
    }
}