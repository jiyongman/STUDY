package boj;
import java.util.*;

public class BOJ25205 { // 경로당펑크 2077

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문자열 s의 길이
        String s = sc.next();
        char[] arr = {'r', 's', 'e', 'f', 'a', 'q', 't', 'd', 'w', 'c', 'z', 'x', 'v', 'g'};
        int cnt = 0;

        for (int i = 0; i < 14; i++) {
            if (s.charAt(N - 1) == arr[i]) {
                cnt++;
            }
        }

        if (cnt == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}