package boj;
import java.util.*;

public class BOJ5163 { // Isn’t It Funny How a Bear Likes Honey?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // the number of data sets

        for (int x = 1; x <= K; x++) {
            int b = sc.nextInt(); // the number of balloons Pooh is using
            double w = sc.nextDouble(); // Pooh’s weight (in grams)
            double sum = 0;

            for (int i = 0; i < b; i++) {
                double r = sc.nextDouble(); // the radius of the balloon (in cm)
                double v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3) / 1000;
                sum += v;
            }

            System.out.println("Data Set " + x + ":");

            if (sum > w) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            System.out.println();
        }

        sc.close();
    }
}