package boj;
import java.util.*;

public class BOJ15001 { // Frog Leaps

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the total number of stops
        long s = sc.nextInt(); // the frog’s start location
        long e = 0; // the minimum number of units of energy the frogs needs to travel to Amsterdam

        for (int i = 0; i < n - 1; i++) {
            long x = sc.nextLong();
            e += Math.pow(x - s, 2);
            s = x;
        }

        System.out.println(e);
        sc.close();
    }
}