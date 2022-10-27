package boj;
import java.util.*;

public class BOJ3183 { // Dates

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int d = sc.nextInt(); // the day
            int m = sc.nextInt(); // the month
            int y = sc.nextInt(); // the year
            int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (d == 0 && m == 0 && y == 0) {
                break;
            }

            if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
                arr[1] = 29;
            }

            int cnt = 0;

            if (m >= 1 && m <= 12) {
                if (d >= 1 && d <= arr[m - 1]) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}