package boj;
import java.util.*;

public class BOJ25246 { // Brexiting and Brentering

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // the name of the subject
        int cnt = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                break;
            }

            cnt++;
        }

        for (int i = 0; i < s.length() - cnt; i++) {
            System.out.print(s.charAt(i));
        }

        System.out.print("ntry");
        sc.close();
    }
}