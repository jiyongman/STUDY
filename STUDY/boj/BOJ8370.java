package boj;
import java.util.*;

public class BOJ8370 { // Plane

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // rows of seats in the business class
        int k1 = sc.nextInt(); // in the business class each row contains seats
        int n2 = sc.nextInt(); // rows of seats in the economic class
        int k2 = sc.nextInt(); // each row in the economic class has seats

        System.out.println(n1 * k1 + n2 * k2);
        sc.close();
    }
}