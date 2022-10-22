package boj;
import java.util.*;

public class BOJ18141 { // Are They All Integers?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] A = new double[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && k != i) {
                        if ((A[i] - A[j]) / A[k] % 1 != 0) {
                            System.out.println("no");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("yes");
        sc.close();
    }
}