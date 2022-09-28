package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ1837 { // 암호제작

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger P = sc.nextBigInteger(); // 두 소수의 곱으로 이루어진 암호
        BigInteger K = sc.nextBigInteger();
        BigInteger i = new BigInteger("2");

        while (true) {
            if (i.compareTo(K) == 1 || i.compareTo(K) == 0) {
                System.out.println("GOOD");
                break;
            } else if (P.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(K) == -1) {
                System.out.println("BAD " + i);
                break;
            }

            i = i.add(BigInteger.ONE);
        }

        sc.close();
    }
}