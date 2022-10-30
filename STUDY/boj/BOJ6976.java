package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ6976 { // Divisibility by 11

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger n = sc.nextBigInteger();
            BigInteger m = n;

            System.out.println(n);

            while (n.compareTo(BigInteger.valueOf(100)) >= 0) {
                BigInteger tmp = n.remainder(BigInteger.TEN);
                n = n.divide(BigInteger.TEN);
                n = n.subtract(tmp);

                System.out.println(n);
            }

            if (n.remainder(BigInteger.valueOf(11)).compareTo(BigInteger.ZERO) == 0) {
                System.out.printf("The number %d is divisible by 11.\n\n", m);
            } else {
                System.out.printf("The number %d is not divisible by 11.\n\n", m);
            }
        }

        sc.close();
    }
}