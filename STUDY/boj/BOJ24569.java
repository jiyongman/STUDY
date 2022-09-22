package boj;
import java.util.*;

public class BOJ24569 { // Fergusonball Ratings

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the total number of players on the team
        int sr = 0; // star rating
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // the number of points that the player scored
            int f = sc.nextInt(); // the number of fouls that the player committed
            sr = 5 * p - (3 * f);

            if (sr > 40) {
                cnt++;
            }
        }

        if (cnt == n) {
            System.out.println(cnt + "+");
        } else {
            System.out.println(cnt);
        }

        sc.close();
    }   
}