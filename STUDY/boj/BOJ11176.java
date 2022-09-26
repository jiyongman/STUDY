package boj;
import java.util.*;

public class BOJ11176 { // In the Shower

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of cases

        for (int i = 0; i < T; i++) {
            int E = sc.nextInt(); // the number of attempts
            int N = sc.nextInt(); // the number of candidate bottles
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                int K = sc.nextInt(); // how many attempts were needed for a particular bottle

                if (E < K) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}