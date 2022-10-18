package boj;
import java.util.*;

public class BOJ17838 { // 커맨드

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int cnt = 0;

            if (str.length() == 7) {
                if (str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(4)) {
                    if (str.charAt(0) != str.charAt(2) && str.charAt(2) == str.charAt(3) && str.charAt(3) == str.charAt(5) && str.charAt(5) == str.charAt(6)) {
                        cnt++;
                    }
                }
            }

            if (cnt == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}