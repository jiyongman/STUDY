package boj;
import java.util.*;

public class BOJ14563 { // 완전수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 자연수의 개수

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int sum = 0;

            for (int j = 1; j <= N / 2; j++) {
                if (N % j == 0) {
                    sum += j;
                }
            }

            if (sum == N) {
                System.out.println("Perfect");
            } else if (sum < N) {
                System.out.println("Deficient");
            } else {
                System.out.println("Abundant");
            }
        }

        sc.close();
    }
}