package boj;
import java.util.*;

public class BOJ6013 { // Lonesome Partners

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        double max = 0;
        int A = 0;
        int B = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (max < Math.sqrt(Math.pow(X[i] - X[j], 2) + Math.pow(Y[i] - Y[j], 2))) {
                    max = Math.sqrt(Math.pow(X[i] - X[j], 2) + Math.pow(Y[i] - Y[j], 2));
                    A = i + 1;
                    B = j + 1;
                }
            }
        }

        System.out.printf("%d %d", A, B);
        sc.close();
    }
}