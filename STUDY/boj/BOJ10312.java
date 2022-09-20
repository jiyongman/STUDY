package boj;
import java.util.*;

public class BOJ10312 { // Lodê

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of test cases 
        int[] X = new int[15];

        for (int i = 0; i < N; i++) {
            int K = sc.nextInt(); // the ship cargo capacity
            int M = 0;
            
            for (int j = 14; j >= 0; j--) {
                X[j] = (int) (K / Math.pow(3, j));
                K %= Math.pow(3, j);
            }

            for (int j = 14; j >= 0; j--) {
                if (X[j] > 0) {
                    M = j;
                    break;
                }
            }

            for (int j = M; j >= 0; j--) {
                System.out.print(X[j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}