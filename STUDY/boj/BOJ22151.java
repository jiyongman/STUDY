package boj;
import java.util.*;

public class BOJ22151 { // Игра

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int xs = sc.nextInt();
            int ys = sc.nextInt();
            int xf = sc.nextInt();
            int yf = sc.nextInt();

            if (Math.abs(xs - xf) + Math.abs(ys - yf) > m) {
                System.out.println("Infinity");
            } else {
                System.out.println("First 1");
            }
        }

        sc.close();
    }
}