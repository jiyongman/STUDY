package boj;
import java.util.*;

public class BOJ7482 { // 상자 만들기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble(); // 판자의 모서리 길이
            double b = a / 6;

            System.out.printf("%.10f\n", b);
        }

        sc.close();
    }
}