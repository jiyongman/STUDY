package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ24309 { // PABEHCTBO

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();

        System.out.println(b.subtract(c).divide(a)); // (b - c) / a
        sc.close();
    }
}