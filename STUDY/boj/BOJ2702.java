package boj;
import java.util.*;

public class BOJ2702 { // 초6 수학

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = 0; // 최대공약수
            int lcm = 0; // 최소공배수

            for (int j = 1; j <= Math.min(a, b); j++) {
                if (a % j == 0 && b % j == 0) {
                    gcd = j;
                    lcm = gcd * (a / j) * (b / j);
                }
            }

            System.out.printf("%d %d\n", lcm, gcd);
        }

        sc.close();
    }
}