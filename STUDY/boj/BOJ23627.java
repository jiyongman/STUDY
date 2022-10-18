package boj;
import java.util.*;

public class BOJ23627 { // driip

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int cnt = 0;

        if (S.length() >= 5) {
            if (S.substring(S.length() - 5).equals("driip")) {
                cnt++;
            }
        }

        if (cnt == 1) {
            System.out.println("cute");
        } else {
            System.out.println("not cute");
        }

        sc.close();
    }
}