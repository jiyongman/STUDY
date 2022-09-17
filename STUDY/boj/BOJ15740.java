package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ15740 { // A + B - 9

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        System.out.println(A.add(B));
        sc.close();
    }
}