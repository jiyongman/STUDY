package boj;
import java.util.*;

public class BOJ10988 { // 팰린드롬인지 확인하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}