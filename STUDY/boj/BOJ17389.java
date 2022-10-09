package boj;
import java.util.*;

public class BOJ17389 { // 보너스 점수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // OX표의 길이
        String S = sc.next(); // OX표
        char[] arr = new char[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = S.charAt(i);

            if (arr[i] == 'O') {
                result += i + 1;
            }
        }

        int cnt = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i] == 'O' && arr[i - 1] == 'O') {
                cnt++;
            } else {
                cnt = 0;
            }

            result += cnt;
        }

        System.out.println(result);
        sc.close();
    }
}