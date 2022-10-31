package boj;
import java.util.*;

public class BOJ13153 { // Formula

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double r = sc.nextDouble(); // the incircle radius that Tim measured
        double a = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
        double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double c = Math.sqrt(Math.pow(x3 - x, 2) + Math.pow(y3 - y, 2));
        double A = Math.sqrt(4 * a * a * b * b - Math.pow(a * a + b * b - c * c, 2)) / 4;
        double r2 = A / (a + b + c) * 2;

        System.out.println((r2 - r) / r * 100);
        sc.close();
    }
}