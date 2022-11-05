package boj;
import java.util.*;

public class BOJ6765 { // Icon Scaling

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("x");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * k; j++) {
                System.out.print("x");
            }

            System.out.println();
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}