package boj;
import java.util.*;

public class BOJ27855 { // Cornhole

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H1 = sc.nextInt(); // the number of bags player 1 got through the hole
        int B1 = sc.nextInt(); // the number of bags player 1 got on the board
        int H2 = sc.nextInt(); // the number of bags player 2 got through the hole
        int B2 = sc.nextInt(); // the number of bags player 2 got on the board
        int P1 = H1 * 3 + B1;
        int P2 = H2 * 3 + B2;
        int P = 0; // the player number

        if (P1 > P2) {
            P = 1;
        } else if (P1 < P2) {
            P = 2;
        }

        int N = Math.abs(P1 - P2); // the number of points the player scored

        if (P == 0) {
            System.out.println("NO SCORE");
        } else {
            System.out.printf("%d %d\n", P, N);
        }

        sc.close();
    }
}