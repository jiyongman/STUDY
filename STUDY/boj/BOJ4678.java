package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ4678 { // Skew Binary

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            BigInteger n = sc.nextBigInteger();

            if (n.compareTo(BigInteger.ZERO) == 0) {
                break;
            }

            BigInteger sum = BigInteger.ZERO;
            int i = 1;

            while (n.compareTo(BigInteger.ZERO) > 0) {
                BigInteger tmp = n.remainder(BigInteger.TEN);
                sum = sum.add(tmp.multiply(BigInteger.valueOf((long) (Math.pow(2, i) - 1))));
                n = n.divide(BigInteger.TEN);
                i++;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}