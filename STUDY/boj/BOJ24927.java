package boj;
import java.util.*;

public class BOJ24927 { // Is It Even?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            while (x % 2 == 0) {
                x /= 2;
                cnt++;
            }
        }

        if (cnt >= K) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}