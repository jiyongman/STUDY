package boj;
import java.util.*;

public class BOJ8760 { // Schronisko

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Z = sc.nextInt(); // test set

        for (int i = 0; i < Z; i++) {
            int W = sc.nextInt(); // the number of rows
            int K = sc.nextInt(); // the number of columns

            System.out.println(W * K / 2);
        }

        sc.close();
    }
}