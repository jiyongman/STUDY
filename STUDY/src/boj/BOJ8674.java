package boj;
import java.util.*;

public class BOJ8674 { // Tabliczka

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); // the size of width
        long b = sc.nextLong(); // the size of length

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println(Math.min(a, b));
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}