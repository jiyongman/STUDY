package boj;
import java.util.*;

public class BOJ3036 { // 링

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();

        for (int i = 0; i < N - 1; i++) {
            int r = sc.nextInt();
            int numerator = r / gcd(R, r);
            int denominator = R / gcd(R, r);

            System.out.printf("%d/%d\n", denominator, numerator);
        }

        sc.close();
    }

    public static int gcd(int p, int q) {

        if (p < q) {
            int tmp = p;
            p = q;
            q = tmp;
        }

        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }
}