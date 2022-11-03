package boj;
import java.util.*;

public class BOJ16255 { // Martian Volleyball

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of cases

        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int cnt = 0;

            while (true) {
                if (Math.abs(x - y) >= 2 && Math.max(x, y) >= k) {
                    break;
                }

                if (x >= y) {
                    x++;
                    cnt++;
                } else {
                    y++;
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}