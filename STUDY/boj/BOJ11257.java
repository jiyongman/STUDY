package boj;
import java.util.*;

public class BOJ11257 { // IT Passport Examination

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of test takers

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // test taker number(8 digits)
            int b = sc.nextInt(); // Strategy(35%)
            int c = sc.nextInt(); // IT management(25%)
            int d = sc.nextInt(); // Technology(40%)
            int sum = b + c + d;

            if (sum >= 55) {
                if (b >= 10.5 && c >= 7.5 && d >= 12) {
                    System.out.println(a + " " + sum + " " + "PASS");
                } else {
                    System.out.println(a + " " + sum + " " + "FAIL");
                }
            } else {
                System.out.println(a + " " + sum + " " + "FAIL");
            }
        }

        sc.close();
    }
}