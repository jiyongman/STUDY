package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ9916 { // Zeros

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger sum = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        String str = String.valueOf(sum);
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}