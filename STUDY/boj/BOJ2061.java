package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ2061 { // 좋은 암호

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger K = sc.nextBigInteger();
        BigInteger L = sc.nextBigInteger();
        BigInteger i = new BigInteger("2");

        while (true) {
            if (i.compareTo(L) == 1 || i.compareTo(L) == 0) {
                System.out.println("GOOD");
                break;
            } else if (K.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(L) == -1) {
                System.out.println("BAD " + i);
                break;
            }

            i = i.add(BigInteger.ONE);
        }

        sc.close();
    }
}