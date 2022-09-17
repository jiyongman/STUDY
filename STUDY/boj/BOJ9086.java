package boj;
import java.util.*;

public class BOJ9086 { // 문자열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            String str = sc.next();

            System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
        }

        sc.close();
    }
}