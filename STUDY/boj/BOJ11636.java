package boj;
import java.util.*;

public class BOJ11636 { // Stand on Zanzibar

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int result = 0; // the number of turtles not born on Zanzibar

            while (true) {
                int n = sc.nextInt();

                if (n == 0) {
                    break;
                }

                if (a * 2 < n) {
                    result += n - (a * 2);
                }

                a = n;
            }

            System.out.println(result);
        }

        sc.close();
    }
}