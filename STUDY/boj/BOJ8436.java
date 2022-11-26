package boj;
import java.util.*;

public class BOJ8436 { // Kamil

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'T' || ch == 'D' || ch == 'L' || ch == 'F') {
                cnt++;
            }
        }

        int result = (int) Math.pow(2, cnt);

        System.out.println(result);
        sc.close();
    }
}