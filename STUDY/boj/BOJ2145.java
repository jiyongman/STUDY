package boj;
import java.util.*;

public class BOJ2145 { // 숫자 놀이

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();

            if (N == 0) {
                break;
            }

            int sum = 0;

            while (N > 0) {
                sum += N % 10;
                N /= 10;
            }

            if (sum >= 10) {
                sum = sum / 10 + sum % 10;
            }

            if (sum >= 10) {
                sum = sum / 10 + sum % 10;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}