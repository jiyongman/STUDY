package boj;
import java.util.*;

public class BOJ7489 { // 팩토리얼

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int result = 1;

            for (int j = 1; j <= n; j++) {
                result *= j;

                while (result % 10 == 0) {
                    result /= 10;
                }

                result %= 1000;
            }

            System.out.println(result % 10);
        }

        sc.close();
    }
}