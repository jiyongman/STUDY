package boj;
import java.util.*;

public class BOJ20953 { // 고고학자 예린

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long sum = a + b;

            System.out.println((sum * sum * (sum - 1) / 2));
        }

        sc.close();
    }
}