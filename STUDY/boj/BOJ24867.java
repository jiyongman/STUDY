package boj;
import java.util.*;

public class BOJ24867 { // Два станка

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong(); // the number of minutes in a shift
        long a = sc.nextLong(); // the time of the introduction of the first machine into operation
        long x = sc.nextLong(); // the number of parts that it produces in one minute
        long b = sc.nextLong(); // the time of the introduction of the second machine into operation
        long y = sc.nextLong(); // the number of parts that it produces in one minute
        long max = 0;
        long max2 = 0;

        if (k > a || k > b || k > a + b) {
            max = Math.max((k - a) * x + (k - (a + b)) * y, (k - b) * y + (k - (a + b)) * x);
            max2 = Math.max((k - a) * x, (k - b) * y);
        }

        long result = Math.max(max, max2);

        System.out.println(result);
        sc.close();
    }
}