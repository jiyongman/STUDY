package boj;
import java.util.*;

public class BOJ21059 { // Methodic Multiplication

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'S') {
                cnt++;
            }
        }

        int cnt2 = 0;

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'S') {
                cnt2++;
            }
        }

        for (int i = 0; i < cnt * cnt2; i++) {
            System.out.print("S(");
        }

        System.out.print(0);

        for (int i = 0; i < cnt * cnt2; i++) {
            System.out.print(")");
        }

        sc.close();
    }
}