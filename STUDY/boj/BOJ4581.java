package boj;
import java.util.*;

public class BOJ4581 { // Voting

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            int y = 0; // the number of the yes vote
            int n = 0; // the number of the no vote
            int a = 0; // the number of the member who was absent from the meeting

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'Y') {
                    y++;
                } else if (str.charAt(i) == 'N') {
                    n++;
                } else if (str.charAt(i) == 'A') {
                    a++;
                }
            }

            if (a >= (double) str.length() / 2) {
                System.out.println("need quorum");
            } else {
                if (y > n) {
                    System.out.println("yes");
                } else if (y < n) {
                    System.out.println("no");
                } else {
                    System.out.println("tie");
                }
            }
        }

        sc.close();
    }
}