package boj;
import java.util.*;

public class BOJ26535 { // Chicken Pen

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n != Math.sqrt(n) * Math.sqrt(n)) {
            n = (int) Math.sqrt(n) + 1;
        } else {
            n = (int) Math.sqrt(n);
        }

        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                if (i == 0 || j == 0 || i == n + 1 || j == n + 1) {
                    System.out.print("x");
                } else {
                    System.out.print(".");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}