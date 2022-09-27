package boj;
import java.util.*;

public class BOJ13871 { // Farm robot

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of posts
        int C = sc.nextInt(); // the number of commands
        int S = sc.nextInt(); // the charging station closest to the devastated area
        int L = 1;
        int cnt = 0;

        if (L == S) {
            cnt++;
        }

        for (int i = 0; i < C; i++) {
            int X = sc.nextInt(); // the sequence of commands received by the robot scarecrow

            if (X == 1) {
                L++;
            } else {
                L--;
            }

            if (L > N) {
                L -= N;
            } else if (L < 1) {
                L += N;
            }

            if (L == S) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}