package boj;
import java.util.*;

public class BOJ6810 { // ISBN

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // the 11th digit
        int b = sc.nextInt(); // the 12th digit
        int c = sc.nextInt(); // the 13th digit
        int sum = 9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3 + a * 1 + b * 3 + c * 1;

        System.out.println("The 1-3-sum is " + sum);
        sc.close();
    }
}