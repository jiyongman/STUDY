package boj;
import java.util.*;

public class BOJ24736 { // Football Scoring

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            int T = sc.nextInt(); // the number of Touchdowns
            int F = sc.nextInt(); // the number of Field Goals
            int S = sc.nextInt(); // the number of Safeties
            int P = sc.nextInt(); // the number of Points-after-touchdown
            int C = sc.nextInt(); // the number of two-point Conversions
            arr[i] = T * 6 + F * 3 + S * 2 + P * 1 + C * 2;
        }

        System.out.println(arr[0] + " " + arr[1]);
        sc.close();
    }
}