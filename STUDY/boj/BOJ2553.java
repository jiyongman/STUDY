package boj;
import java.util.*;

public class BOJ2553 { // 마지막 팩토리얼 수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long result = 1;

        for (int i = 1; i <= N; i++) {
            result *= i;

            while (result % 10 == 0) {
                result /= 10;
            }

            result %= 1000000000;
        }

        System.out.println(result % 10);
        sc.close();
    }
}