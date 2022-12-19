package boj;
import java.util.*;

public class BOJ26592 { // Triangle Height

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of lines

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble(); // the area of a triangle
            double b = sc.nextDouble(); // the base length of a triangle
            double h = 2 * a / b;

            System.out.printf("The height of the triangle is %.2f units\n", h);
        }

        sc.close();
    }
}