package boj;
import java.util.*;

public class BOJ8387 { // Dyslexia

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the length of the original text
        String str = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == str2.charAt(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}