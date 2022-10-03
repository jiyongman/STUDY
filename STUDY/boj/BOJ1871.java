package boj;
import java.util.*;

public class BOJ1871 { // 좋은 자동차 번호판

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 번호판의 수

        for (int i = 0; i < N; i++) {
            String str = sc.next(); // 자동차 번호판
            String str2 = str.substring(0, 3);
            int k = Integer.parseInt(str.substring(4));
            int result = 0;
            int tmp = str2.length() - 1;

            for (int j = 0; j < str2.length(); j++) {
                int a = str2.charAt(j) - 'A';
                result += a * Math.pow(26, tmp);
                tmp--;
            }

            if (Math.abs(result - k) <= 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }
        }

        sc.close();
    }
}