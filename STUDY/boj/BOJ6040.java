package boj;
import java.math.BigInteger;
import java.util.*;

public class BOJ6040 { // Hexadecimal Conversion

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        byte[] arr = new BigInteger(str, 16).toByteArray();
        String str2 = new BigInteger(arr).toString(8);

        System.out.println(str2);
        sc.close();
    }
}