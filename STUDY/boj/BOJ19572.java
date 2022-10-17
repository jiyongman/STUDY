package boj;
import java.util.*;

public class BOJ19572 { // 가뭄(Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        double a = (d1 + d2 - d3) / 2;
        double b = (d1 + d3 - d2) / 2;
        double c = (d2 + d3 - d1) / 2;

        if (a > 0 && b > 0 && c > 0) {
            System.out.println(1);
            System.out.printf("%.1f %.1f %.1f", a, b, c);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}