package boj;
import java.util.*;

public class BOJ27310 { // :chino_shock:

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int colon = 0;
        int underbar = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ':') {
                colon++;
            } else if (str.charAt(i) == '_') {
                underbar++;
            }
        }

        int difficulty = str.length() + colon + underbar * 5;

        System.out.println(difficulty);
        sc.close();
    }
}