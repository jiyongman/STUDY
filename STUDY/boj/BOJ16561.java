package boj;
import java.util.*;

public class BOJ16561 { // 3의 배수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 임의의 3의 배수
        int result = 0;
        int cnt = 1;

        for (int i = 9; i <= n; i += 3) {
            result += cnt;
            cnt++;
        }

        System.out.println(result);
        sc.close();
    }
}