package boj;
import java.util.*;

public class BOJ18312 { // 시각

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= N * 3600 + 3599; i++) {
            int h = i / 3600;
            int m = i / 60 % 60;
            int s = i % 60;
            String t = String.format("%02d:%02d:%02d", h, m, s);

            if (t.contains(String.valueOf(K))) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}