package boj;
import java.util.*;

public class BOJ26561 { // Population

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of lines

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // the beginning population
            int t = sc.nextInt(); // the amount of time that will pass

            for (int j = 1; j <= t; j++) {
                if (j % 28 == 0) {
                    continue;
                } else if (j % 7 == 0) {
                    p--;
                } else if (j % 4 == 0) {
                    p++;
                }
            }

            System.out.println(p);
        }

        sc.close();
    }
}