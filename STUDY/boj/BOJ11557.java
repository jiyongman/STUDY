package boj;
import java.util.*;

public class BOJ11557 { // Yangjojang of The Year

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 숫자

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 학교의 숫자
            String str = "";
            int max = 0;

            for (int j = 0; j < N; j++) {
                String S = sc.next(); // 학교 이름
                int L = sc.nextInt(); // 해당 학교가 지난 한 해동안 소비한 술의 양

                if (L > max) {
                    max = L;
                    str = S;
                }
            }

            System.out.println(str);
        }

        sc.close();
    }
}