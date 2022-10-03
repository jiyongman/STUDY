package boj;
import java.util.*;

public class BOJ2902 { // KMP는 왜 KMP일까?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(str.charAt(0));

        for (int i = 1; i <= str.length(); i++) {
            if (str.charAt(i - 1) == '-') {
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}