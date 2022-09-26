package boj;
import java.util.*;

public class BOJ9838 { // XMAS

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of guests
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            arr[k - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}