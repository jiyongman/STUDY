package boj;
import java.util.*;

public class BOJ25630 { // 팰린드롬 소떡소떡

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 소떡소떡의 길이
        String str = sc.next(); // 소떡소떡을 의미하는 문자열
        int cnt = 0;

        for (int i = 0; i < N / 2; i++) {
            if (str.charAt(i) != str.charAt(N - 1 - i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}