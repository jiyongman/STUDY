package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ8437 { // Julka

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(); // all of apples they have
        BigInteger b = sc.nextBigInteger(); // how much more apples Klaudia has than Natalia
        BigInteger K = a.add(b).divide(BigInteger.valueOf(2)); // the number of apples Klaudia has
        BigInteger N = K.subtract(b); // the number of apples Natalia has

        System.out.println(K);
        System.out.println(N);
        sc.close();
    }
}