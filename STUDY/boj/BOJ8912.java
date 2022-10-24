package boj;
import java.util.*;

public class BOJ8912 { // Sales

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            int cnt = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    if (a[j] >= a[k]) {
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}