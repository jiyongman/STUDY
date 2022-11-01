package boj;
import java.util.*;

public class BOJ5959 { // Crop Circles

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        int[] R = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if (Math.sqrt(Math.pow(X[i] - X[j], 2) + Math.pow(Y[i] - Y[j], 2)) < R[i] + R[j]) {
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}