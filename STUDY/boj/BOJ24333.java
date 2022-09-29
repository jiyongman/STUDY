package boj;
import java.util.*;

public class BOJ24333 { // СРЕЩА НА ПРИЯТЕЛИ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;

        for (int i = l1; i <= r1; i++) {
            for (int j = l2; j <= r2; j++) {
                if (i == j && j != k) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}