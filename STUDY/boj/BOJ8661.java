package boj;
import java.util.*;

public class BOJ8661 { // Stopki

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // the boys' distance from each other
        int k = sc.nextInt(); // the length of Kozik's foot
        int a = sc.nextInt(); // the length of Adrian's foot
        int n = 0;
        int m = x;
        int cnt = 0;

        while (true) {
            n += k;

            if (n > m) {
                cnt++;
                break;
            }

            m -= a;

            if (n > m) {
                cnt--;
                break;
            }
        }

        if (cnt > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}