package boj;
import java.util.*;

public class BOJ14726 { // 신용카드 판별

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int sum = 0;

            for (int j = str.length() - 1; j >= 0; j--) {
                if (j % 2 == 0) {
                    int n = (str.charAt(j) - '0') * 2;

                    if (n >= 10) {
                        n = n / 10 + n % 10;
                    }

                    sum += n;
                } else {
                    sum += str.charAt(j) - '0';
                }
            }

            if (sum % 10 == 0) {
                System.out.println("T");
            } else {
                System.out.println("F");
            }
        }

        sc.close();
    }
}