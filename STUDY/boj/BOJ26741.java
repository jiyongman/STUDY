package boj;
import java.util.*;

public class BOJ26741 { // Farma

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 0; i <= X; i++) {
            if (Y == 2 * i + 4 * (X - i)) {
                System.out.printf("%d %d", i, X - i);
                return;
            }
        }

        sc.close();
    }
}