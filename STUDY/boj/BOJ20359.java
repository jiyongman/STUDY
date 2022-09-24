package boj;
import java.util.*;

public class BOJ20359 { // A simple task

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;

        while (true) {
            if (n % 2 > 0) {
                break;
            }

            n /= 2;
            p++;
        }

        System.out.println(n + " " + p);
        sc.close();
    }
}
