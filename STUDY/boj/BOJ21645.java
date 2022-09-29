package boj;
import java.util.*;

public class BOJ21645 { // Ролевая игра

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of players
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (m > k) {
            System.out.println(n * (m / k + k - 1));
        } else {
            System.out.println(n * m);
        }

        sc.close();
    }
}