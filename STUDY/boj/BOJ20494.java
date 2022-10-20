package boj;
import java.util.*;

public class BOJ20494 { // 스시

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            String B = sc.next(); // 손님이 먹고 싶어하는 스시의 목록을 나타내는 문자열

            result += B.length();
        }

        System.out.println(result);
        sc.close();
    }
}