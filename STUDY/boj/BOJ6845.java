package boj;
import java.util.*;

public class BOJ6845 { // Federal Voting Age

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int y = sc.nextInt(); // the year of a potential voter’s birth
            int m = sc.nextInt(); // the month of a potential voter’s birth
            int d = sc.nextInt(); // the day of a potential voter’s birth

            if (y < 1989 || (y == 1989 && m < 2) || (y == 1989 && m == 2 && d <= 27)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}