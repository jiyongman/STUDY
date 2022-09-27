package boj;
import java.util.*;

public class BOJ13617 { // Handebol

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of players
        int M = sc.nextInt(); // the number of matches
        int result = 0;

        for (int i = 0; i < N; i++) {
            int cnt = 0;

            for (int j = 0; j < M; j++) {
                int X = sc.nextInt(); // the number of goals of the i-th player in every match

                if (X > 0) {
                    cnt++;
                }
                if (cnt == M) {
                    result++;
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}