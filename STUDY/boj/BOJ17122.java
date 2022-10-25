package boj;
import java.util.*;

public class BOJ17122 { // 체스

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int n = sc.nextInt();
            int b = 0; // black
            int w = 0; // white

            if (str.charAt(0) == 'A' || str.charAt(0) == 'C' || str.charAt(0) == 'E' || str.charAt(0) == 'G') {
                if ((str.charAt(1) - '0') % 2 > 0) {
                    b++;
                } else {
                    w++;
                }
            } else {
                if ((str.charAt(1) - '0') % 2 == 0) {
                    b++;
                } else {
                    w++;
                }
            }

            if (((n - 1) / 8) % 2 == 0) {
                if (n % 2 > 0) {
                    b++;
                } else {
                    w++;
                }
            } else {
                if (n % 2 == 0) {
                    b++;
                } else {
                    w++;
                }
            }

            if (b == 2 || w == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}