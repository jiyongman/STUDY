package boj;
import java.util.*;

public class BOJ26742 { // Skarpetki

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int B = 0;
        int C = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'B') {
                B++;
            } else {
                C++;
            }
        }

        int cnt = B / 2 + C / 2;

        System.out.println(cnt);
        sc.close();
    }
}