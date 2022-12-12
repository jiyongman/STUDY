package boj;
import java.util.*;

public class BOJ3234 { // LUKA

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // Luka's position
        int Y = sc.nextInt(); // Luka's position
        int K = sc.nextInt();
        String str = sc.next(); // the route that The Task Makers were taking that day
        int TX = 0;
        int TY = 0;
        int cnt = 0;

        if ((TX >= X - 1 && TX <= X + 1) && (TY >= Y - 1 && TY <= Y + 1)) {
            System.out.println(0);
            cnt++;
        }

        for (int i = 0; i < K; i++) {
            char ch = str.charAt(i);

            if (ch == 'I') {
                TX++;
            } else if (ch == 'S') {
                TY++;
            } else if (ch == 'Z') {
                TX--;
            } else {
                TY--;
            }

            if ((TX >= X - 1 && TX <= X + 1) && (TY >= Y - 1 && TY <= Y + 1)) {
                System.out.println(i + 1);
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println(-1);
        }

        sc.close();
    }
}