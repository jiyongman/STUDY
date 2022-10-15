package boj;
import java.util.*;

public class BOJ14914 { // 사과와 바나나 나눠주기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 사과의 개수
        int b = sc.nextInt(); // 바나나의 개수

        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.printf("%d %d %d\n", i, a / i, b / i);
            }
        }

        sc.close();
    }
}