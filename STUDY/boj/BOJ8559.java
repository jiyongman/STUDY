package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ8559 { // Potęga

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        if (n.compareTo(BigInteger.ZERO) == 0) {
            System.out.println(1);
        } else {
            if (n.remainder(BigInteger.valueOf(4)).compareTo(BigInteger.ZERO) == 0) {
                System.out.println(6);
            } else if (n.remainder(BigInteger.valueOf(4)).compareTo(BigInteger.ONE) == 0) {
                System.out.println(2);
            } else if (n.remainder(BigInteger.valueOf(4)).compareTo(BigInteger.valueOf(2)) == 0) {
                System.out.println(4);
            } else {
                System.out.println(8);
            }
        }

        sc.close();
    }
}