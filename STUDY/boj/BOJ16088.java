package boj;
import java.util.*;

public class BOJ16088 { // Finding Your Coach

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == m) {
                System.out.println("G");
            } else if (Math.abs(n - m) <= l && Math.abs(n - m) <= r) {
                System.out.println("E");
            } else if (Math.abs(n - m) <= l) {
                System.out.println("L");
            } else {
                System.out.println("R");
            }
        }

        sc.close();
    }
}