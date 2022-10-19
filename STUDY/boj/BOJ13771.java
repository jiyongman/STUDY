package boj;
import java.util.*;

public class BOJ13771 { // Presents

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of prices
        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble(); // dollars and cents
        }

        Arrays.sort(arr);

        System.out.printf("%.2f", arr[1]);
        sc.close();
    }
}