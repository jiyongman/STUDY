package boj;
import java.util.*;

public class BOJ8718 { // Bałwanek

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // the number of liters of snow in the park
        int k = sc.nextInt(); // the number of liters of snow that Kasia used

        if (7 * k <= x) {
            System.out.println(7000 * k);
        } else if (3.5 * k <= x) {
            System.out.println(3500 * k);
        } else if (1.75 * k <= x) {
            System.out.println(1750 * k);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}