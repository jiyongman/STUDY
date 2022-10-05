package boj;
import java.util.*;

public class BOJ5618 { // 공약수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = Math.min(a, b);

            for (int i = 1; i <= min; i++) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min = Math.min(a, Math.min(b, c));

            for (int i = 1; i <= min; i++) {
                if (a % i == 0 && b % i == 0 && c % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}