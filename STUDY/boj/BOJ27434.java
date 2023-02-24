package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ27434 { // 팩토리얼 3

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= N / 2; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i * (N - i + 1)));
        }

        if (N % 2 > 0) {
            factorial = factorial.multiply(BigInteger.valueOf(N / 2 + 1));
        }

        System.out.println(factorial);
        sc.close();
    }
}