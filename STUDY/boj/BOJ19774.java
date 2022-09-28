package boj;
import java.util.*;

public class BOJ19774 { // ABCD-код

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of code variants that Vasya remembers

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            if ((Math.pow(n / 100, 2) + Math.pow(n % 100, 2)) % 7 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}