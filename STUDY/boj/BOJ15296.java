package boj;
import java.util.*;

public class BOJ15296 { // Sum Squared Digits Function

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt(); // the number of data sets

        for (int i = 0; i < P; i++) {
            int K = sc.nextInt(); // the data set number
            int b = sc.nextInt(); // the base
            int n = sc.nextInt(); // the positive integer

            System.out.printf("%d %d\n", K, SSD(b, n));
        }

        sc.close();
    }

    public static int SSD(int b, int n) {

        int sum = 0;

        while (n > 0) {
            sum += (n % b) * (n % b);
            n /= b;
        }

        return sum;
    }
}