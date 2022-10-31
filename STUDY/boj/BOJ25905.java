package boj;
import java.util.*;

public class BOJ25905 { // 장인은 도구를 탓하지 않는다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] p = new double[11];
        
        for (int i = 1; i <= 10; i++) {
            p[i] = sc.nextDouble();
        }

        Arrays.sort(p);
        double result = 1;

        for (int i = 10; i >= 2; i--) {
            result *= p[i] / (11 - i);
        }

        result *= 1000000000;

        System.out.print(result);
        sc.close();
    }
}