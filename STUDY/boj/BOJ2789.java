package boj;
import java.util.*;

public class BOJ2789 { // 유학 금지

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'C' || ch == 'A' || ch == 'M' || ch == 'B' || ch == 'R' || ch == 'I' || ch == 'D' || ch == 'G' || ch == 'E') {
                continue;
            }

            System.out.print(ch);
        }

        sc.close();
    }
}