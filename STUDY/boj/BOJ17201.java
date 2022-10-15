package boj;
import java.util.*;

public class BOJ17201 { // 자석 체인

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 관빈이가 가지고 있는 자석의 개수
        String str = sc.next();
        int cnt = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}