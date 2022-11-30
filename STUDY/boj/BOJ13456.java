package boj;
import java.util.*;

public class BOJ13456 { // Richard Hamming

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // the dimension of the vectors
            int[] v = new int[n];

            for (int j = 0; j < n; j++) {
                v[j] = sc.nextInt();
            }

            int[] u = new int[n];
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                u[j] = sc.nextInt();

                if (v[j] != u[j]) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}