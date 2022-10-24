package boj;
import java.util.*;

public class BOJ12517 { // Centauri Prime (Small1)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            String C = sc.next(); // the name of one country
            char ch = C.charAt(C.length() - 1);
            String Y = "";

            if (ch == 'y') {
                Y = "nobody";
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                Y = "a queen";
            } else {
                Y = "a king";
            }

            System.out.printf("Case #%d: %s is ruled by %s.\n", x, C, Y);
        }

        sc.close();
    }
}