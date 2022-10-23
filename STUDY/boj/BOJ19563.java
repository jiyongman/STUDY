package boj;
import java.util.*;

public class BOJ19563 { // 개구리 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

       if (a + b <= c) {
            if ((a + b) % 2 == 0 && c % 2 == 0) {
                System.out.println("YES");
            } else if ((a + b) % 2 > 0 && c % 2 > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}