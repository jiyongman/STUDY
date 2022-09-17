package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ22193 { // Multiply

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        System.out.println(A.multiply(B));
        sc.close();
    }
}