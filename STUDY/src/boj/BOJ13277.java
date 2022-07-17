package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ13277 { // 큰 수 곱셈

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        System.out.println(A.multiply(B));
        sc.close();
    }
}