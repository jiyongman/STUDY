package boj;
import java.util.*;

public class BOJ26736 { // Wynik meczu

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int X = 0;
        int Y = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                X++;
            } else {
                Y++;
            }
        }

        System.out.printf("%d : %d", X, Y);
        sc.close();
    }
}