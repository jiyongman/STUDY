package boj;
import java.util.*;

public class BOJ5656 { // 비교 연산자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            int a = sc.nextInt(); // 피연산자
            String str = sc.next(); // 연산자
            int b = sc.nextInt(); // 피연산자
            boolean bl = false;

            if (str.equals("E")) {
                break;
            } else if (str.equals(">")) {
                bl = a > b;
            } else if (str.equals(">=")) {
                bl = a >= b;
            } else if (str.equals("<")) {
                bl = a < b;
            } else if (str.equals("<=")) {
                bl = a <= b;
            } else if (str.equals("==")) {
                bl = a == b;
            } else {
                bl = a != b;
            }

            System.out.printf("Case %d: %b\n", i, bl);
            i++;
        }

        sc.close();
    }
}