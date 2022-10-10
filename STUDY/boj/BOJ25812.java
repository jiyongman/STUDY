package boj;
import java.util.*;

public class BOJ25812 { // Nice Raises

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of team members
        int r = sc.nextInt(); // the fixed raise offered by FAAMGInc
        int f = 0; // the fixed raise option
        int d = 0; // the double the salary option

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt(); // the current salary for a team member

            if (2 * s < s + r) {
                f++;
            } else if (2 * s > s + r) {
                d++;
            }
        }

        if (f > d) {
            System.out.println(1);
        } else if (f < d) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}