package boj;
import java.util.*;

public class BOJ25829 { // Presidential Election

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of states
        int sum = 0;
        int sum2 = 0;
        int cnt = 0;
        int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            int e = sc.nextInt(); // electoral votes for the state
            int v1 = sc.nextInt(); // votes for the first candidate
            int v2 = sc.nextInt(); // votes for the second candidate

            if (v1 > v2) {
                cnt += e;
            } else if (v1 < v2) {
                cnt2 += e;
            }

            sum += v1;
            sum2 += v2;
        }

        if (sum > sum2 && cnt > cnt2) {
            System.out.println(1);
        } else if (sum < sum2 && cnt < cnt2) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}