package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ19946 { // 2의 제곱수 계산하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger N = sc.nextBigInteger(); // 태영이가 2^64를 계산했을 때 나올 수 있는 수
        BigInteger TWO = new BigInteger("2");
        BigInteger ONE = BigInteger.ONE;
        int i = 64;

        while (true) {
            if (N.remainder(TWO).equals(ONE)) {
                System.out.println(i);
                break;
            }

            N = N.divide(TWO);
            i--;
        }

        sc.close();
    }
}