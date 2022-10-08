package boj;
import java.util.*;

public class BOJ5789 { // 한다 안한다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            int cnt = 0;

            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) == str.charAt(str.length() - 1 - j)) {
                    cnt = 1;
                } else {
                    cnt = 0;
                }
            }

            if (cnt == 1) {
                System.out.println("Do-it");
            } else {
                System.out.println("Do-it-Not");
            }
        }

        sc.close();
    }
}