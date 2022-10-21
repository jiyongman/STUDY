package boj;
import java.util.*;

public class BOJ17177 { // 내접사각형 만들기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x = Math.sqrt((a * a) - (b * b));
        double y = Math.sqrt((a * a) - (c * c));
        double d = ((x * y) - (b * c)) / a;

        if (d > 0) {
            System.out.printf("%.0f\n", d);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}