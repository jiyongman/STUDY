package boj;
import java.util.*;

public class BOJ7947 { // Koncert

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt(); // the number of consecutive data sets

        for (int i = 0; i < z; i++) {
            double sum = 0;
            double sum2 = 0;
            double sum3 = 0;

            for (int j = 0; j < 10; j++) {
                double r = sc.nextDouble();
                double g = sc.nextDouble();
                double b = sc.nextDouble();
                sum += r;
                sum2 += g;
                sum3 += b;
            }
            sum /= 10;
            sum2 /= 10;
            sum3 /= 10;

            System.out.println(Math.round(sum) + " " + Math.round(sum2) + " " + Math.round(sum3));
        }

        sc.close();
    }
}