package boj;
import java.util.*;

public class BOJ15115 { // Delayed Work

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double K = sc.nextDouble();
        double P = sc.nextDouble();
        double X = sc.nextDouble();
        double M = Math.round(Math.sqrt(K * P / X));
        double result = K * P / M + M * X;

        System.out.printf("%.3f", result);
        sc.close();
    }
}