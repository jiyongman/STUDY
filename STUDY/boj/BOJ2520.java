package boj;
import java.util.*;

public class BOJ2520 { // 팬케이크 사랑

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = {8, 8, 4, 1, 9};
        int[] arr2 = {1, 30, 25, 10};

        for (int i = 0; i < t; i++) {
            double min = Double.MAX_VALUE;

            for (int j = 0; j < 5; j++) {
                min = Math.min(min, sc.nextDouble() / arr[j]);
            }

            double dough = 16 * min;
            int topping = 0;

            for (int j = 0; j < 4; j++) {
                topping += sc.nextInt() / arr2[j];
            }

            System.out.println(Math.min((int) dough, topping));
        }

        sc.close();
    }
}