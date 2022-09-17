package boj;
import java.util.*;

public class BOJ8710 { // Koszykarz

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // the height of Kozik
        int w = sc.nextInt(); // the height that the trainer requires
        int m = sc.nextInt(); // the value of tumor growth

        if (w - k <= 0) {
            System.out.println(0);
        } else if ((w - k) % m == 0) {
            System.out.println((w - k) / m);
        } else {
            System.out.println((w - k) / m + 1);
        }

        sc.close();
    }
}