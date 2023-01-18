package boj;
import java.util.*;

public class BOJ27251 { // Звездочки

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i * i, 100); j++) {
                System.out.print("*");
            }

            if (i > 10) {
                System.out.print("...");
            }

            System.out.println();
        }

        sc.close();
    }
}