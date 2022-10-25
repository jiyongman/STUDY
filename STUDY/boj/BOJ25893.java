package boj;
import java.util.*;

public class BOJ25893 { // Majestic 10

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of players

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt(); // the stats for a player
            int s2 = sc.nextInt(); // the stats for a player
            int s3 = sc.nextInt(); // the stats for a player

            System.out.printf("%d %d %d\n", s, s2, s3);

            if (s >= 10 && s2 >= 10 && s3 >= 10) {
                System.out.printf("triple-double\n\n");
            } else if ((s >= 10 && s2 >= 10) || (s2 >= 10 && s3 >= 10) || (s >= 10 && s3 >= 10)) {
                System.out.printf("double-double\n\n");
            } else if (s >= 10 || s2 >= 10 || s3 >= 10) {
                System.out.printf("double\n\n");
            } else {
                System.out.print("zilch\n\n");
            }
        }

        sc.close();
    }
}