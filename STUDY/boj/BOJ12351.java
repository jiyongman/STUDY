package boj;
import java.util.*;

public class BOJ12351 { // Hedgemony (Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int N = sc.nextInt(); // the number of bushes
            double[] arr = new double[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextDouble(); // the heights of the bushes
            }

            double y = 0; // the height of bush number N - 1

            for (int i = 1; i < N - 1; i++) {
                double avg = (arr[i - 1] + arr[i + 1]) / 2;

                if (arr[i] > avg) {
                    arr[i] = avg;
                }

                y = arr[i];
            }

            System.out.printf("Case #%d: %.6f\n", x, y);
        }

        sc.close();
    }
}