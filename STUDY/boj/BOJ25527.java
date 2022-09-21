package boj;
import java.util.*;

public class BOJ25527 { // Counting Peaks of Infection

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt(); // the number of days on which the numbers of positive cases are reported

            if (n == 0) {
                break;
            }

            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt(); // the number of positive cases on the i-th day
            }

            int cnt = 0;

            for (int i = 1; i < n - 1; i++) {
                if (v[i - 1] < v[i] && v[i] > v[i + 1]) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}
