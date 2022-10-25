package boj;
import java.util.*;

public class BOJ6139 { // Speed Reading

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the pages of book
        int K = sc.nextInt(); // the number of cows

        for (int i = 0; i < K; i++) {
            int S = sc.nextInt(); // the reading speed S pages per minute
            int T = sc.nextInt(); // the maximum consecutive reading time
            int R = sc.nextInt(); // the minimum rest time
            int P = 0; // pages
            int M = 0; // minutes
            int cnt = 0;

            while (true) {
                P += S;
                M++;
                cnt++;

                if (N <= P) {
                    break;
                }

                if (cnt == T) {
                    M += R;
                    cnt = 0;
                }
            }

            System.out.println(M);
        }

        sc.close();
    }
}