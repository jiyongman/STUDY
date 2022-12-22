package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ26711 { // A+B

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger sum = a.add(b);

        System.out.println(sum);
        sc.close();
    }
}