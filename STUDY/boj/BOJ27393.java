package boj;
import java.util.*;

public class BOJ27393 { // Smallest Calculated Value

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            int x = calculated(a, b, i);

            for (int j = 0; j < 4; j++) {
                int y = calculated(x, c, j);

                if (y >= 0) {
                    min = Math.min(min, y);
                }
            }
        }

        System.out.println(min);
        sc.close();
    }

    public static int calculated(int p, int q, int i) {

        if (i == 0) {
            return p + q;
        } else if (i == 1) {
            return p - q;
        } else if (i == 2) {
            return p * q;
        } else {
            if (p % q == 0) {
                return p / q;
            }
        }

        return Integer.MAX_VALUE;
    }
}