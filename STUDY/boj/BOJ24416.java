package boj;
import java.util.*;

public class BOJ24416 { // 알고리즘 수업 - 피보나치 수 1

    static int[] f;
    static int cnt_recursion, cnt_dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f = new int[n + 1];
        fib(n);
        fibonacci(n);

        System.out.printf("%d %d", cnt_recursion, cnt_dp);
        sc.close();
    }

    public static int fib(int n) {

        if (n == 1 || n == 2) {
            cnt_recursion++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n) {

        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            cnt_dp++;
        }

        return f[n];
    }
}
