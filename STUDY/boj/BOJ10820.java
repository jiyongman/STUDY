package boj;
import java.util.*;

public class BOJ10820 { // 문자열 분석

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            int l = 0; // 알파벳 소문자의 개수
            int u = 0; // 알파벳 대문자의 개수
            int n = 0; // 숫자의 개수
            int s = 0; // 공백의 개수

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    l++;
                } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    u++;
                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    n++;
                } else if (str.charAt(i) == ' ') {
                    s++;
                }
            }

            System.out.printf("%d %d %d %d\n", l, u, n, s);
        }

        sc.close();
    }
}