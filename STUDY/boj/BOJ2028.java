package boj;
import java.util.*;

public class BOJ2028 { // 자기복제수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String str = String.valueOf(N * N);
            String str2 = String.valueOf(N);

            if (str.substring(str.length() - str2.length()).equals(str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}