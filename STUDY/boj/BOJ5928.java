package boj;
import java.util.*;

public class BOJ5928 { // Contest Timing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt(); // the day of the month
        int H = sc.nextInt(); // hours
        int M = sc.nextInt(); // minutes
        int t1 = 11 * 60 * 24 + 11 * 60 + 11; // when the contest starts(minutes)
        int t2 = D * 60 * 24 + H * 60 + M; // when Bessie ends the contest(minutes)
        int t = t2 - t1;

        if (t < 0) {
            System.out.println(-1);
        } else {
            System.out.println(t);
        }

        sc.close();
    }
}