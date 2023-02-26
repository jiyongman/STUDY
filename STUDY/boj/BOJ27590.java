package boj;
import java.util.*;

public class BOJ27590 { // Sun and Moon

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ds = sc.nextInt(); // how many years ago the sun was in the right position
        int ys = sc.nextInt(); // how many years it takes for the sun to be back in that position
        int dm = sc.nextInt(); // how many years ago the moon was in the right position
        int ym = sc.nextInt(); // how many years it takes for the moon to be back in that position
        boolean[] sun = new boolean[5001];
        boolean[] moon = new boolean[5001];

        for (int i = ys - ds; i <= 5000; i += ys) {
            sun[i] = true;
        }

        for (int i = ym - dm; i <= 5000; i += ym) {
            moon[i] = true;
        }

        for (int i = 0; i <= 5000; i++) {
            if (sun[i] && moon[i]) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}