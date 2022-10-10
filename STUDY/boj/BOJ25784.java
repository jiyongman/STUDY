package boj;
import java.util.*;

public class BOJ25784 { // Easy-to-Solve Expressions

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b == c || b + c == a || c + a == b) {
            System.out.println(1);
        } else if (a * b == c || b * c == a || c * a == b) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        sc.close();
    }
}