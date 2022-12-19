package boj;
import java.util.*;

public class BOJ26546 { // Reverse

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int x = 0; x < n; x++) {
            String str = sc.next();
            int i = sc.nextInt();
            int j = sc.nextInt();

            System.out.println(str.substring(0, i) + str.substring(j));
        }

        sc.close();
    }
}