package boj;
import java.util.*;

public class BOJ9924 { // The Euclidean Algorithm

    static int cnt;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        gcd(A, B);

        System.out.println(cnt);
        sc.close();
    }

    public static int gcd(int a, int b) {

        if (a == b) {
            return b;
        } else {
            cnt++;
            return gcd(Math.max(a, b) - Math.min(a, b), Math.min(a, b));
        }
    }
}