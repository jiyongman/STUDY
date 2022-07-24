package boj;
import java.util.*;

public class BOJ8558 { // Silnia

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) { //
            result *= i;
            result %= 10;
        }

        System.out.println(result);
        sc.close();
    }
}