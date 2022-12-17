package boj;
import java.util.*;

public class BOJ5292 { // Counting Swann’s Coins

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("DeadMan");
            } else if (i % 5 == 0) {
                System.out.println("Man");
            } else if (i % 3 == 0) {
                System.out.println("Dead");
            } else {
                System.out.printf("%d ", i);
            }
        }

        sc.close();
    }
}