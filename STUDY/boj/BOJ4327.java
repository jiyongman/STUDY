package boj;
import java.util.*;

public class BOJ4327 { // Combination Lock

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int d = sc.nextInt(); // the position of the dial
            int x = sc.nextInt(); // the combination
            int y = sc.nextInt(); // the combination
            int z = sc.nextInt(); // the combination

            if (d == 0 && x == 0 && y == 0 && z == 0) {
                break;
            }

            int result = 0;
            result += 40 * 2;

            if (d > x) {
                result += d - x;
            } else {
                result += 40 + d - x;
            }

            result += 40;

            if (x < y) {
                result += y - x;
            } else {
                result += 40 + y - x;
            }

            if (y > z) {
                result += y - z;
            } else {
                result += 40 + y - z;
            }

            System.out.println(9 * result);
        }

        sc.close();
    }
}
