package boj;
import java.util.*;

public class BOJ11340 { // Making the Grade?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(); // the project score
            int b = sc.nextInt(); // the term paper score
            int c = sc.nextInt(); // the midterm exam score
            int d = 0; // the minimum integer final exam score
            double tmp = a * 0.15 + b * 0.2 + c * 0.25;

            while (tmp + (d * 0.4) < 90) {
                d++;

                if (d > 100) {
                    break;
                }
            }

            if (d > 100) {
                System.out.println("impossible");
            } else {
                System.out.println(d);
            }
        }

        sc.close();
    }
}