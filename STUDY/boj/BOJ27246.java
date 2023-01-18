package boj;
import java.util.*;

public class BOJ27246 { // Различные квадраты

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;

        for (long i = 1; i <= Math.sqrt(n); i++) {
            n -= i * i;
            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}