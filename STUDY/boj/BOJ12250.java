package boj;
import java.util.*;

public class BOJ12250 { // New Lottery Game (Small)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int K = sc.nextInt();
            int y = 0; // the number of possible pairs that the machines can generate to make Catalina a winner
            
            for (int i = 0; i < A; i++) {
                for (int j = 0; j < B; j++) {
                    if ((i & j) < K) {
                        y++;
                    }
                }
            }

            System.out.println("Case #" + x + ": " + y);
        }

        sc.close();
    }   
}