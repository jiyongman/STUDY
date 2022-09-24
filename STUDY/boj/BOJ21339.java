package boj;
import java.util.*;

public class BOJ21339 { // Contest Struggles

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the total number of problems
        int k = sc.nextInt(); // the number of problems Lotte's team has solved so far
        double d = sc.nextDouble(); // the average difficulty of all the problems
        double s = sc.nextDouble(); // Lotte's estimate of the average difficulty of the problems her team has solved
        double e = (n * d - s * k) / (n - k); // the average difficulty of the unsolved problems

        if (e < 0 || e > 100) {
            System.out.println("impossible");
        } else {
            System.out.println(e);
        }

        sc.close();
    }
}