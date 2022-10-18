package boj;
import java.util.*;

public class BOJ12836 { // 가계부 (Easy)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 월곡이가 살아온 날
        int Q = sc.nextInt(); // 쿼리의 개수
        long[] arr = new long[N + 1];

        for (int i = 0; i < Q; i++) {
            int n = sc.nextInt();

            if (n == 1) {
                int p = sc.nextInt();
                int x = sc.nextInt();
                arr[p] += x;
            } else {
                int p = sc.nextInt();
                int q = sc.nextInt();
                long sum = 0;

                for (int j = p; j <= q; j++) {
                    sum += arr[j];
                }

                System.out.println(sum);
            }
        }

        sc.close();
    }
}