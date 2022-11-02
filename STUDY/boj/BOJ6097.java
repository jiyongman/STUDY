package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ6097 { // Cruel Math Teacher

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger N = sc.nextBigInteger();
        int P = sc.nextInt();
        BigInteger K = BigInteger.ONE;

        while (P > 0) {
            K = K.multiply(N);
            P--;
        }

        String str = K.toString();

        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && i % 70 == 0) {
                System.out.println();
            }

            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}