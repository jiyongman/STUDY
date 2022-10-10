package boj;
import java.util.*;

public class BOJ9546 { // 3000번 버스

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < t; i++) {
            int k = sc.nextInt(); // 정류장의 수
            int result = (int) Math.pow(2, k) - 1;

            System.out.println(result);
        }

        sc.close();
    }
}