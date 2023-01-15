package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ1676 { // 팩토리얼 0의 개수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger N_Factorial = BigInteger.ONE;

        while (N > 0) {
            N_Factorial = N_Factorial.multiply(BigInteger.valueOf(N));
            N--;
        }

        int cnt = 0;

        while (N_Factorial.remainder(BigInteger.TEN).compareTo(BigInteger.ZERO) == 0) {
            N_Factorial = N_Factorial.divide(BigInteger.TEN);
            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}