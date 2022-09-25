package boj;
import java.util.*;

public class BOJ8574 { // Ratownik

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of children
        double k = sc.nextDouble(); // the lifeguard's range of sight
        double x = sc.nextDouble(); // the lifeguard's location
        double y = sc.nextDouble(); // the lifeguard's location
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            double xi = sc.nextDouble(); // the coordinates$ and i-th child
            double yi = sc.nextDouble(); // the coordinates$ and i-th child
            double d = Math.sqrt(Math.pow(xi - x, 2) + Math.pow(yi - y, 2));

            if (d > k) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}