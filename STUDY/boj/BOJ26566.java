package boj;
import java.util.*;

public class BOJ26566 { // Pizza

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            double A1 = sc.nextDouble();
            double P1 = sc.nextDouble();
            double R1 = sc.nextDouble();
            double P2 = sc.nextDouble();
            double S = A1 / P1;
            double W = (Math.PI * R1 * R1) / P2;

            if (S < W) {
                System.out.println("Whole pizza");
            } else {
                System.out.println("Slice of pizza");
            }
        }

        sc.close();
    }
}