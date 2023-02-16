package boj;
import java.util.*;

public class BOJ9865 { // Undercut

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            int tessa_score = 0;
            int danny_score = 0;

            for (int j = 0; j < m; j++) {
                int tessa_card = sc.nextInt();
                int danny_card = sc.nextInt();

                if (tessa_card > danny_card) {
                    if (tessa_card - danny_card == 1) {
                        if (tessa_card == 2) {
                            danny_score += (tessa_card + danny_card) * 2;
                        } else {
                            danny_score += tessa_card + danny_card;
                        }
                    } else {
                        tessa_score += tessa_card;
                    }
                } else if (tessa_card < danny_card) {
                    if (danny_card - tessa_card == 1) {
                        if (danny_card == 2) {
                            tessa_score += (danny_card + tessa_card) * 2;
                        } else {
                            tessa_score += danny_card + tessa_card;
                        }
                    } else {
                        danny_score += danny_card;
                    }
                }
            }

            System.out.printf("Game %d: Tessa %d Danny %d\n", i, tessa_score, danny_score);
        }

        sc.close();
    }
}