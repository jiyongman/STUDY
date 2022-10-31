package boj;
import java.util.*;

public class BOJ9182 { // Biorhythms

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 1;

        while (true) {
            int p = sc.nextInt(); // the number of days from the beginning of the current year at which the physical cycle peaks
            int e = sc.nextInt(); // the number of days from the beginning of the current year at which the emotional cycle peaks
            int i = sc.nextInt(); // the number of days from the beginning of the current year at which the intellectual cycle peaks
            int d = sc.nextInt(); // the given date

            if (p == -1 && e == -1 && i == -1 && d == -1) {
                break;
            }

            p %= 23;
            e %= 28;
            i %= 33;
            int y = 0;

            for (int j = d; j <= 21252; j++) {
                if (j % 23 == p && j % 28 == e && j % 33 == i) {
                    y = j - d;
                }
            }

            System.out.printf("Case %d: the next triple peak occurs in %d days.\n", x, y);
            x++;
        }

        sc.close();
    }
}