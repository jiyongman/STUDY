package boj;
import java.util.*;

public class BOJ10675 { // Cow Routing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // Bessie's farm
        int B = sc.nextInt(); // Bessie's tropical destination
        int N = sc.nextInt();
        int min = 1001;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt(); // the cost of using the route
            int Y = sc.nextInt(); // the number of cities along the route
            int cnt = 0;

            for (int j = 0; j < Y; j++) {
                int C = sc.nextInt(); // a list of the cities in order along the route

                if (A == C) {
                    cnt++;
                }

                if (B == C && cnt > 0) {
                    min = Math.min(min, X);
                }
            }
        }

        if (min < 1001) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}