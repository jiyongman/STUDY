package boj;
import java.util.*;

public class BOJ4850 { // Baskets of Gold Coins

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            int w = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            int result = w * (N * (N - 1) / 2) - c;

            if (result == 0) {
                System.out.println(N);
            } else {
                System.out.println(result / d);
            }
        }

        sc.close();
    }
}