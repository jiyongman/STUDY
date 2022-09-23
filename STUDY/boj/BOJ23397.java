package boj;
import java.util.*;

public class BOJ23397 { // Katmandu

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of consecutive minutes you need to sleep to be rested
        int D = sc.nextInt(); // the flight duration
        int M = sc.nextInt(); // the number of meals that will be served during the flight
        int[] y = new int[M + 2];
        y[0] = 0;
        y[M + 1] = D;
        int cnt = 0;

        for (int i = 1; i <= M; i++) {
            y[i] = sc.nextInt(); // the times at which each meal will be served
        }

        for (int i = 0; i < M + 1; i++) {
            if (y[i + 1] - y[i] >= T) {
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}