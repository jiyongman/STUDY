package boj;
import java.util.*;

public class BOJ23663 { // Deja vu of Go Players

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // the numbers of piles of the red player
            int m = sc.nextInt(); // the numbers of piles of the white player
            int[] a = new int[n];
            int[] b = new int[m];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt(); // the number of pieces in a black pile of the red player
            }

            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt(); // the number of pieces in a white pile of the white player
            }

            if (n <= m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }   
}