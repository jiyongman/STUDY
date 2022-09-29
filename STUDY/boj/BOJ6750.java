package boj;
import java.util.*;

public class BOJ6750 { // Rotating letters

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'I' || ch == 'O' || ch == 'S' || ch == 'H' || ch == 'Z' || ch == 'X' || ch == 'N') {
                cnt++;
            }
        }

        if (cnt == str.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}