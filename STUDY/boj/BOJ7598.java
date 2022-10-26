package boj;
import java.util.*;

public class BOJ7598 { // Bookings

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            int n = sc.nextInt();

            if (str.equals("#") && n == 0) {
                break;
            }

            while (true) {
                String str2 = sc.next();
                int m = sc.nextInt();

                if (str2.equals("X") && m == 0) {
                    break;
                }

                if (str2.equals("B")) {
                    n += m;
                } else {
                    n -= m;
                }

                if (n > 68) {
                    n -= m;
                } else if (n < 0) {
                    n += m;
                }
            }

            System.out.printf("%s %d\n", str, n);
        }

        sc.close();
    }
}