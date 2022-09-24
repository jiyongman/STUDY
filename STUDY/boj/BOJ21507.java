package boj;
import java.util.*;

public class BOJ21507 { // POBEDA-2014

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long sum = Math.min(a, b) + Math.min(c, d);
        long n = (long) Math.sqrt(sum);

        while (n * n > sum) {
            n--;
        }

        System.out.println(n);
        sc.close();
    }
}