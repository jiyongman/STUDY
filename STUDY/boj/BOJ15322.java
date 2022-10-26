package boj;
import java.util.*;

public class BOJ15322 { // Košnja

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int result = 2 * (Math.min(N, M) - 1);

            System.out.println(result);
        }

        sc.close();
    }
}