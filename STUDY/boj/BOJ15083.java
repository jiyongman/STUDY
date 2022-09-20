package boj;
import java.util.*;

public class BOJ15083 { // Life Savings

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer[] p = new Integer[3];
        Integer[] c = new Integer[3];

        for (int i = 0; i < 3; i++) {
            p[i] = sc.nextInt(); // the prices of three objects to be purchased
        }

        for (int i = 0; i < 3; i++) {
            c[i] = sc.nextInt(); // the coupon percentage for the entire purchase and two one-item coupons
        }

        Arrays.sort(p, Collections.reverseOrder());
        double one = (double) (p[0] + p[1] + p[2]) * c[0] / 100;
        double two = (double) p[0] * Math.max(c[1], c[2]) / 100 + (double) p[1] * Math.min(c[1], c[2]) / 100;

        if (one > two) {
            System.out.printf("one %.2f", one);
        } else {
            System.out.printf("two %.2f", two);
        }

        sc.close();
    }   
}