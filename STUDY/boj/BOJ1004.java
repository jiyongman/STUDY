package boj;
import java.util.*;

public class BOJ1004 { // 어린 왕자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int n = sc.nextInt();
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int r = sc.nextInt();
                boolean case1 = false;
                boolean case2 = false;

                if (Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2)) {
                    case1 = true;
                }

                if (Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) {
                    case2 = true;
                }

                if ((case1 && !case2) || (!case1 && case2)) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}