package boj;
import java.util.*;

public class BOJ13772 { // Holes

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == 'B') {
                    cnt += 2;
                } else if (ch == 'A' || ch == 'D' || ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R') {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}