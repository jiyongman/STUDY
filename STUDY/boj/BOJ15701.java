package boj;
import java.util.*;

public class BOJ15701 { // 순서쌍

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (N / i == i) {
                    cnt++;
                } else {
                    cnt += 2;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}