package boj;
import java.util.*;

public class BOJ10205 { // 헤라클레스와 히드라

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // 데이터 세트의 개수

        for (int x = 1; x <= K; x++) {
            int h = sc.nextInt(); // 히드라의 머리 개수
            String str = sc.next(); // 헤라클레스와 이올라우스의 일련의 행동들

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == 'b') {
                    h--;
                } else {
                    h++;
                }
            }

            System.out.println("Data Set " + x + ":");
            System.out.println(h);
            System.out.println();
        }

        sc.close();
    }
}