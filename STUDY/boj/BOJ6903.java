package boj;
import java.util.*;

public class BOJ6903 { // Trident

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the height of the tines
        int s = sc.nextInt(); // the spacing between tines
        int h = sc.nextInt(); // the length of the handle

        for (int i = 0; i < t; i++) {
            System.out.print("*");

            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

        for (int i = 0; i < 2 * s + 3; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < s + 1; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

        sc.close();
    }
}