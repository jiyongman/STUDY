package boj;
import java.util.*;

public class BOJ10174 { // 팰린드롬

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // 테스트 케이스의 개수

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().toLowerCase();
            int cnt = 0;

            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}