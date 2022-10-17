package boj;
import java.util.*;

public class BOJ17466 { // N! mod P (1)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long P = sc.nextLong(); // N보다 큰 소수
        long result = 1;

        for (int i = 1; i <= N; i++) {
            result *= i;
            result %= P;
        }

        System.out.println(result % P);
        sc.close();
    }
}