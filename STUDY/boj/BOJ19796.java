package boj;
import java.util.*;

public class BOJ19796 { // Реклама на заборе

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // the number of boards in the fence
        int n = sc.nextInt(); // the number of days during which Peter made his observations
        int[] arr = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            for (int j = l; j <= r; j++) {
                arr[j] = 1;
            }
        }

        int cnt = 0;

        for (int i = 1; i <= m; i++) {
            if (arr[i] == 1) {
                cnt++;
            }
        }

        if (cnt == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}