package boj;
import java.util.*;

public class BOJ12518 { // Centauri Prime (Small2)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            String C = sc.next(); // the name of one country
            char ch = C.charAt(C.length() - 1);
            String Y = "";

            if (ch == 'y' || ch == 'Y') {
                Y = "nobody";
            } else if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                Y = "a queen";
            } else {
                Y = "a king";
            }

            System.out.printf("Case #%d: %s is ruled by %s.\n", x, C, Y);
        }

        sc.close();
    }
}