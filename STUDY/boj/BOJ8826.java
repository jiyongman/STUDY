package boj;
import java.util.*;

public class BOJ8826 { // Spacer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Z = sc.nextInt();

        for (int i = 0; i < Z; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            int x = 0;
            int y = 0;

            for (int j = 0; j < n; j++) {
                char direction = str.charAt(j);

                if (direction == 'N') {
                    y++;
                } else if (direction == 'S') {
                    y--;
                } else if (direction == 'W') {
                    x--;
                } else {
                    x++;
                }
            }

            System.out.println(Math.abs(x) + Math.abs(y));
        }

        sc.close();
    }
}