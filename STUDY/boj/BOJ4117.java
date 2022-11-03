package boj;
import java.util.*;

public class BOJ4117 { // Combination Lock

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            int T1 = sc.nextInt();
            int T2 = sc.nextInt();
            int T3 = sc.nextInt();

            if (N == 0 && T1 == 0 && T2 == 0 && T3 == 0) {
                break;
            }

            int result = 0;
            result += N * 2;
            result += N - 1;
            result += N;

            if (T1 < T2) {
                result += T2 - T1;
            } else {
                result += N + T2 - T1;
            }

            if (T2 > T3) {
                result += T2 - T3;
            } else {
                result += N + T2 - T3;
            }

            System.out.println(result);
        }

        sc.close();
    }
}