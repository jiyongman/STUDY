package boj;
import java.util.*;

public class BOJ24510 { // 시간복잡도를 배운 도도

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); // 코드의 줄 개수
        int max = 0;

        for (int i = 0; i < C; i++) {
            String str = sc.next();
            int cnt = 0;

            for (int j = 0; j <= str.length() - 3; j++) {
                if (str.substring(j, j + 3).equals("for")) {
                    cnt++;
                }
            }

            for (int j = 0; j <= str.length() - 5; j++) {
                if (str.substring(j, j + 5).equals("while")) {
                    cnt++;
                }
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);
        sc.close();
    }
}