package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ21507 { // POBEDA-2014

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a1 = sc.nextBigInteger();
        BigInteger a2 = sc.nextBigInteger();
        BigInteger a3 = sc.nextBigInteger();
        BigInteger a4 = sc.nextBigInteger();
        BigInteger n = (a1.min(a2).add(a3.min(a4)));

        System.out.println(n.sqrt());
        sc.close();
    }
}