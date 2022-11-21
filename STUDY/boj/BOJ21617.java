package boj;
import java.util.*;

public class BOJ21617 { // Crazy Fencing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] h = new double[N + 1];

        for (int i = 0; i < N + 1; i++) {
            h[i] = sc.nextDouble(); // the left and right heights of each piece of wood
        }

        double sum = 0; // the total area of the fence

        for (int i = 1; i < N + 1; i++) {
            double w = sc.nextDouble(); // the width of the i-th piece of wood
            sum += w * (h[i - 1] + h[i]) / 2;
        }

        System.out.println(sum);
        sc.close();
    }
}