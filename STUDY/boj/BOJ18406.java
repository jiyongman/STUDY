package boj;
import java.util.*;

public class BOJ18406 { // 럭키 스트레이트

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.next(); // 점수
        int sum = 0;

        for (int i = 0; i < N.length() / 2; i++) {
            sum += N.charAt(i) - '0';
        }

        int sum2 = 0;

        for (int i = N.length() / 2; i < N.length(); i++) {
            sum2 += N.charAt(i) - '0';
        }

        if (sum == sum2) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }

        sc.close();
    }
}