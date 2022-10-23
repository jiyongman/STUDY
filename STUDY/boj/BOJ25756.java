package boj;
import java.util.*;

public class BOJ25756 { // 방어율 무시 계산하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double V = 0;

        for (int i = 0; i < N; i++) {
            double A = sc.nextDouble();
            V = 1 - (1 - V) * (1 - A / 100);

            System.out.println(V * 100);
        }

        sc.close();
    }
}