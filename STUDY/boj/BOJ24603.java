package boj;
import java.util.*;

public class BOJ24603 { // Scaling Recipe

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of ingredients in the recipe
        int x = sc.nextInt(); // the number of portions that the recipe produces
        int y = sc.nextInt(); // the number of portions you need
        double result = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // the number of portions you need
            result = (double) a / x * y;

            System.out.println((int) result);
        }

        sc.close();
    }   
}