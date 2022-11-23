package boj;
import java.util.*;

public class BOJ4864 { // Gold Coins

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int sum = 0;
            int tmp = 1;
            int cnt = 0;

            for (int i = 1; i <= n; i++) {
                sum += tmp;
                cnt++;

                if (tmp == cnt) {
                    tmp++;
                    cnt = 0;
                }
            }

            System.out.printf("%d %d\n", n, sum);
        }

        sc.close();
    }
}