package boj;
import java.util.*;

public class BOJ15351 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            int score = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                
                if (ch == ' ') {
                    continue;
                }

                score += ch - 'A' + 1;
            }

            if (score == 100) {
                System.out.println("PERFECT LIFE");
            } else {
                System.out.println(score);
            }
        }

        sc.close();
    }
}