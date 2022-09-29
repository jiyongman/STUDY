package boj;
import java.util.*;

public class BOJ22150 { // Шоколадка

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of queries

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // the size of the chocolate
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                if (l + r == n) {
                    cnt++;
                }
            }

            if (cnt != n) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}