package boj;
import java.util.*;

public class BOJ27512 { // 스네이크

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n % 2 != 0 && m % 2 != 0) {
            System.out.println(n * m - 1);
        } else {
            System.out.println(n * m);
        }

        sc.close();
    }
}