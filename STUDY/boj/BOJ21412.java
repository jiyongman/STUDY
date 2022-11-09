package boj;
import java.util.*;

public class BOJ21412 { // Дробь

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n / 2; i > 0; i--) {
            if (gcd(i, n - i) == 1) {
                System.out.printf("%d %d", i, n - i);
                break;
            }
        }

        sc.close();
    }

    public static int gcd(int i, int j) {

        if (j == 0) {
            return i;
        } else {
            return gcd(j, i % j);
        }
    }
}