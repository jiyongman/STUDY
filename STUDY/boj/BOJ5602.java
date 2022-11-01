package boj;
import java.util.*;

public class BOJ5602 { // 問題1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int k = sc.nextInt();

                if (k > 0) {
                    arr[j]++;
                }
            }
        }

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= m; j++) {
                if (arr[j] == i) {
                    System.out.printf("%d ", j);
                }
            }
        }

        sc.close();
    }
}