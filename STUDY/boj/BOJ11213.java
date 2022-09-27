package boj;
import java.util.*;

public class BOJ11213 { // Black Friday

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the group size
        int[] arr = new int[7];
        int[] idx = new int[7];

        for (int i = 1; i <= n; i++) {
            int j = sc.nextInt(); // the outcome of each participant’s die roll
            arr[j]++;
            idx[j] = i;
        }

        for (int i = 6; i > 0; i--) {
            if (arr[i] == 1) {
                System.out.println(idx[i]);
                return;
            }
        }

        System.out.println("none");
        sc.close();
    }
}