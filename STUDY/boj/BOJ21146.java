package boj;
import java.util.*;

public class BOJ21146 { // Rating Problems

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the total number of judges
        int k = sc.nextInt(); // the number of judges who have already rated the problem
        double sum = 0;

        for (int i = 0; i < k; i++) {
            double r = sc.nextDouble();
            sum += r;
        }

        double min = (sum + -3 * (n - k)) / n;
        double max = (sum + 3 * (n - k)) / n;

        System.out.println(min + " " + max);
        sc.close();
    }
}