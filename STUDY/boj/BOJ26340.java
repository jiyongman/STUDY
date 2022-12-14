package boj;
import java.util.*;

public class BOJ26340 { // Fold the Paper Nicely

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // the rectangle sides
            int b = sc.nextInt(); // the rectangle sides
            int f = sc.nextInt(); // the number of folds

            System.out.printf("Data set: %d %d %d\n", a, b, f);

            if (a < b) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            for (int j = 0; j < f; j++) {
                a /= 2;

                if (a < b) {
                    int tmp = a;
                    a = b;
                    b = tmp;
                }
            }

            System.out.printf("%d %d\n\n", a, b);
        }

        sc.close();
    }
}