package boj;
import java.util.*;

public class BOJ21614 { // Secret Instructions

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "";

        while (true) {
            int n = sc.nextInt(); // an instruction

            if (n == 99999) {
                break;
            }

            int result = n % 1000;

            if (n / 10000 + n / 1000 == 0) {
                System.out.println(str + result);
            } else if ((n / 10000 + n / 1000) % 2 > 0) {
                str = "left ";
                System.out.println(str + result);
            } else {
                str = "right ";
                System.out.println(str + result);
            }
        }

        sc.close();
    }
}