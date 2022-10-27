package boj;
import java.util.*;

public class BOJ13155 { // Common Knowledge

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = (long) Math.pow(8, n);

        System.out.println(result);
        sc.close();
    }
}