package boj;
import java.util.*;

public class BOJ13420 { // 사칙연산

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수
        long result = 0;

        for (int i = 0; i < T; i++) {
            long a = sc.nextLong();
            String str = sc.next();
            long b = sc.nextLong();
            String str2 = sc.next();
            long c = sc.nextLong();

            if (str.equals("+")) {
                result = a + b;
            } else if (str.equals("-")) {
                result = a - b;
            } else if (str.equals("*")) {
                result = a * b;
            } else {
                result = a / b;
            }

            if (result == c) {
                System.out.println("correct");
            } else {
                System.out.println("wrong answer");
            }
        }

        sc.close();
    }
}