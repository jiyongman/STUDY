package boj;
import java.util.*;

public class BOJ7567 { // 그릇

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 괄호문자로만 이루어진 문자열
        int result = 10;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                result += 5;
            } else {
                result += 10;
            }
        }

        System.out.println(result);
        sc.close();
    }
}