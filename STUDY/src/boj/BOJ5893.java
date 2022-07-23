package boj;
import java.util.*;
import java.math.BigInteger;

public class BOJ5893 { // 17배

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        BigInteger a = new BigInteger(N, 2); // 문자열 N을 이진법 정수로 인식해 십진법 정수로 변환
        BigInteger b = new BigInteger(Integer.toBinaryString(17), 2); // 문자열 17을 이진법 정수로 인식해 십진법 정수로 변환
        String str = a.multiply(b).toString(2);

        System.out.println(str);
        sc.close();
    }
}