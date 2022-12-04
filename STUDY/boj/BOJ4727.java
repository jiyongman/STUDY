package boj;
import java.util.*;

public class BOJ4727 { // Close Enough Computations

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt(); // the number of calories
            int b = sc.nextInt(); // the number of grams of fat
            int c = sc.nextInt(); // the number of grams of carbohydrate
            int d = sc.nextInt(); // the number of grams of protein

            if (a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }

            double minb = b - 0.5;
            double minc = c - 0.5;
            double mind = d - 0.5;
            double maxb = b + 0.5;
            double maxc = c + 0.5;
            double maxd = d + 0.5;

            if (b == 0) {
                minb = b;
                maxb = b;
            }

            if (c == 0) {
                minc = c;
                maxc = c;
            }

            if (d == 0) {
                mind = d;
                maxd = d;
            }

            if (a >= minb * 9 + minc * 4 + mind * 4 && a < maxb * 9 + maxc * 4 + maxd * 4) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}