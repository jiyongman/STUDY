package boj;
import java.util.*;

public class BOJ6502 { // 동혁 피자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            int r = sc.nextInt(); // 식탁의 반지름

            if (r == 0) {
                break;
            }

            double w = sc.nextDouble(); // 피자의 너비
            double l = sc.nextDouble(); // 피자의 높이

            if (r >= Math.sqrt(w * w + l * l) / 2) {
                System.out.printf("Pizza %d fits on the table.\n", i);
            } else {
                System.out.printf("Pizza %d does not fit on the table.\n", i);
            }

            i++;
        }

        sc.close();
    }
}