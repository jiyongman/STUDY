package boj;
import java.util.*;

public class BOJ26173 { // Cup Covering

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); // the area of the round stroopwafel
        double r = Math.sqrt(a / Math.PI);

        System.out.println(2 * r);
        sc.close();
    }
}