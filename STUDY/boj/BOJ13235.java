package boj;
import java.util.*;

public class BOJ13235 { // 팰린드롬

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}