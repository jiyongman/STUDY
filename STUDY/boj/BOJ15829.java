package boj;
import java.util.*;

public class BOJ15829 { // Hashing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 문자열의 길이
        String str = sc.next();
        int r = 31;
        int M = 1234567891;
        long result = 0;

        for (int i = 0; i < L; i++) {
            long tmp = str.charAt(i) - 'a' + 1;

            for (int j = 0; j < i; j++) {
                tmp *= r;
                tmp %= M;
            }

            result += tmp;
            result %= M;
        }

        System.out.println(result);
        sc.close();
    }
}