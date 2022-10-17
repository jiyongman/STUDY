package boj;
import java.util.*;

public class BOJ23251 { // 스물셋

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();

            System.out.println(23 * k);
        }

        sc.close();
    }
}