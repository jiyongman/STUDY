package boj;
import java.util.*;

public class BOJ24302 { // КУРИЕРИ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        for (int i = 0; i < 2; i++) {
            int x = sc.nextInt();
            x /= 1000;
            int st = 0; // stotinki
            int sum = 0;
            int sum2 = 0;

            if (x <= 5) {
                st = 400;
            } else if (x <= 10) {
                st = 700;
            } else if (x <= 20) {
                st = 1200;
            } else if (x <= 30) {
                st = 1700;
            } else {
                st = x * 57;
            }

            sum += st;
            st = 0;

            if (x <= 2) {
                st = 90 + x * 90;
            } else if (x <= 5) {
                st = 100 + x * 85;
            } else if (x <= 20) {
                st = 125 + x * 80;
            } else if (x <= 40) {
                st = 325 + x * 70;
            } else {
                st = 925 + x * 55;
            }

            sum2 += st;
            result += Math.min(sum, sum2);
        }

        System.out.printf("%d.%02d", result / 100, result % 100);
        sc.close();
    }
}