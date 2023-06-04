package boj;
import java.util.*;

public class BOJ28097 { // 모범생 포닉스

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int h = 0;

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            h += T;

            if (i != N - 1) {
                h += 8;
            }
        }

        int d = h / 24;
        h %= 24;

        System.out.printf("%d %d", d, h);
        sc.close();
    }
}