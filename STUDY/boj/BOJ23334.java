package boj;
import java.util.*;

public class BOJ23334 { // Olympic Ranking

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        String[] countries = new String[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt() * 1000 * 1000 + sc.nextInt() * 1000 + sc.nextInt();
            countries[i] = sc.nextLine();
            max = Math.max(max, scores[i]);
        }

        for (int i = 0; i < n; i++) {
            if (max == scores[i]) {
                System.out.println(countries[i].substring(1));
                break;
            }
        }

        sc.close();
    }
}