package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ27130 { // Long Multiplication

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a);
        System.out.println(b);

        BigInteger tmp = b;

        while (tmp.compareTo(BigInteger.ZERO) > 0) {
            System.out.println(a.multiply(tmp.remainder(BigInteger.TEN)));
            tmp = tmp.divide(BigInteger.TEN);
        }

        System.out.println(a.multiply(b));
        sc.close();
    }
}