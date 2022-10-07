package boj;
import java.util.*;

public class BOJ13410 { // 거꾸로 구구단

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 단
        int K = sc.nextInt(); // 항
        int max = 0;

        for (int i = 1; i <= K; i++) {
            int tmp = N * i;
            int result = 0;

            while (tmp > 0) {
                result = result * 10 + tmp % 10;
                tmp /= 10;
            }

            max = Math.max(max, result);
        }

        System.out.println(max);
        sc.close();
    }
}