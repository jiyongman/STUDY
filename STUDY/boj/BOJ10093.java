package boj;
import java.util.*;

public class BOJ10093 { // 숫자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        if (A < B) {
            long N = B - (A + 1);

            System.out.println(N);

            for (long i = A + 1; i < B; i++) {
                System.out.print(i + " ");
            }
        } else if (A > B) {
            long N = A - (B + 1);

            System.out.println(N);

            for (long i = B + 1; i < A; i++) {
                System.out.print(i + " ");
            }
        } else {
            long N = 0;

            System.out.println(N);
        }

        sc.close();
    }
}