package boj;
import java.util.*;

public class BOJ2711 { // 오타맨 고창영

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // 창영이가 오타를 낸 위치
            String str = sc.next(); // 창영이가 친 문자열

            for (int j = 0; j < str.length(); j++) {
                if (j == n - 1) {
                    continue;
                }

                System.out.print(str.charAt(j));
            }

            System.out.println();
        }

        sc.close();
    }
}