package boj;
import java.util.*;

public class BOJ27213 { // Граничные клетки

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long result = m * n;

        if (m >= 3 && n >= 3) {
            result -= (m - 2) * (n - 2);
        }

        System.out.println(result);
        sc.close();
    }
}