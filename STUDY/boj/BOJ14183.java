package boj;
import java.util.*;

public class BOJ14183 { // Key Maker

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = sc.nextInt(); // the number of cuts in the customer’s key
            int n = sc.nextInt(); // the number of keys with the same number of cuts in the trash-box

            if (m == 0 && n == 0) {
                break;
            }

            int[] arr = new int[m];
            int[][] arr2 = new int[n][m];

            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }

            int result = 0;

            for (int i = 0; i < n; i++) {
                int cnt = 0;

                for (int j = 0; j < m; j++) {
                    if (arr[j] >= arr2[i][j]) {
                        cnt++;
                    }
                }

                if (cnt == m) {
                    result++;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}