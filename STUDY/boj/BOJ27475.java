package boj;
import java.util.*;

public class BOJ27475 { // Cancel the Trains

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] bottoms = new int[n];

            for (int j = 0; j < n; j++) {
                bottoms[j] = sc.nextInt();
            }

            int[] lefts = new int[m];

            for (int j = 0; j < m; j++) {
                lefts[j] = sc.nextInt();
            }

            int cnt = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (bottoms[j] == lefts[k]) {
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}