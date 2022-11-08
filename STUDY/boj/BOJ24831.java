package boj;
import java.util.*;

public class BOJ24831 { // Two Rabbits

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(); // the current position of the taller rabbit
            int y = sc.nextInt(); // the current position of the shorter rabbit
            int a = sc.nextInt(); // the hopping distance of the taller rabbit
            int b = sc.nextInt(); // the hopping distance of the shorter rabbit

            if ((y - x) % (a + b) == 0) {
                System.out.println((y - x) / (a + b));
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}