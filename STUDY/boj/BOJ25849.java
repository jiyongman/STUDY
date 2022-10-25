package boj;
import java.util.*;

public class BOJ25849 { // Briefcases Full of Money

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // the number of 1 bill
        int b = sc.nextInt() * 5; // the number of 5 bills
        int c = sc.nextInt() * 10; // the number of 10 bills
        int d = sc.nextInt() * 20; // the number of 20 bills
        int e = sc.nextInt() * 50; // the number of 50 bills
        int f = sc.nextInt() * 100; // the number of 100 bills
        int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, f)))));

        if (max == f) {
            System.out.println(100);
        } else if (max == e) {
            System.out.println(50);
        } else if (max == d) {
            System.out.println(20);
        } else if (max == c) {
            System.out.println(10);
        } else if (max == b) {
            System.out.println(5);
        } else {
            System.out.println(1);
        }

        sc.close();
    }
}