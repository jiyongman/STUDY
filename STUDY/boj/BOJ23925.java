package boj;
import java.util.*;

public class BOJ23925 { // Retype

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            long N = sc.nextLong(); // the number of levels in the game
            long K = sc.nextLong(); // the current level you are in
            long S = sc.nextLong(); // the level where you have to pick up the sword
            long y = 0; // the least amount of total time to finish the game
            y = Math.min(N + K, N + 2 * (K - S));

            System.out.println("Case #" + x + ": " + y);
        }

        sc.close();
    }   
}