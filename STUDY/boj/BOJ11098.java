package boj;
import java.util.*;

public class BOJ11098 { // 첼시를 도와줘!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // 고려해야될 선수의 수
            int max = 0;
            String str = "";

            for (int j = 0; j < p; j++) {
                int C = sc.nextInt(); // 선수의 가격
                String N = sc.next(); // 선수의 이름

                if (C > max) {
                    max = C;
                    str = N;
                }
            }

            System.out.println(str);
        }

        sc.close();
    }
}