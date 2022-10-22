package boj;
import java.util.*;

public class BOJ4593 { // Rock, Paper, Scissors

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            String str2 = sc.next();

            if (str.equals("E") && str2.equals("E")) {
                break;
            }

            int P1 = 0;
            int P2 = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                char ch2 = str2.charAt(i);

                if ((ch == 'R' && ch2 == 'S') || (ch == 'P' && ch2 == 'R') || (ch == 'S' && ch2 == 'P')) {
                    P1++;
                } else if ((ch == 'R' && ch2 == 'P') || (ch == 'P' && ch2 == 'S') || (ch == 'S' && ch2 == 'R')) {
                    P2++;
                }
            }

            System.out.printf("P1: %d\n", P1);
            System.out.printf("P2: %d\n", P2);
        }

        sc.close();
    }
}