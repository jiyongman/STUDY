package boj;
import java.util.*;

public class BOJ26575 { // Pups

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of lines

        for (int i = 0; i < n; i++) {
            double d = sc.nextDouble(); // the number of dogs
            double f = sc.nextDouble(); // the amount of food per dog in pounds
            double p = sc.nextDouble(); // the price of the food per pound
            double sum = d * f * p;

            System.out.printf("$%.2f\n", sum);
        }

        sc.close();
    }
}