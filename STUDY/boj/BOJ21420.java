package boj;
import java.util.*;

public class BOJ21420 { // Монетки

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of coins
        int cnt = 0;
        int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();

            if (k == 1) {
                cnt++;
            } else {
                cnt2++;
            }
        }

        if (cnt < cnt2) {
            System.out.println(cnt);
        } else {
            System.out.println(cnt2);
        }

        sc.close();
    }
}