package boj;
import java.util.*;

public class BOJ25640 { // MBTI

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 진호의 MBTI 유형
        int N = sc.nextInt(); // 진호의 친구의 수
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str2 = sc.next(); // 친구들의 MBTI 유형

            if (str.equals(str2)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}