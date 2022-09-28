package boj;
import java.util.*;

public class BOJ18063 { // Jazz Enthusiast

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of songs
        int c = sc.nextInt(); // the crossfade time in seconds
        int s = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int a = Integer.parseInt(str.substring(0, 1));
            int b = Integer.parseInt(str.substring(2));
            s += a * 60 + b;
        }

        s -= c * (n - 1);
        int h = s / 3600;
        int m = s % 3600 / 60;
        s = s % 60;

        System.out.printf("%02d:%02d:%02d\n", h, m, s);
        sc.close();
    }
}