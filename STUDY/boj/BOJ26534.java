package boj;
import java.util.*;

public class BOJ26534 { // Goats

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] dice1 = new int[6];
        int[] dice2 = new int[6];

        for (int i = 0; i < 6; i++) {
            dice1[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            dice2[i] = sc.nextInt();
        }

        int player1_win = 0;
        int player2_win = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (dice1[i] > dice2[j]) {
                    player1_win++;
                } else if (dice1[i] < dice2[j]) {
                    player2_win++;
                }
            }
        }

        double probability = (double) player1_win / (player1_win + player2_win);

        System.out.printf("%.5f", probability);
        sc.close();
    }
}