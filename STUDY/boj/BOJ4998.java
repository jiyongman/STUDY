package boj;
import java.util.*;

public class BOJ4998 { // 저금

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double N = sc.nextDouble();
            double B = sc.nextDouble();
            double M = sc.nextDouble();
            int cnt = 0;

            while (N <= M) {
                N += N * (B / 100);
                cnt++;
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}