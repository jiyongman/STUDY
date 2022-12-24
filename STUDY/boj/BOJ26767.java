package boj;
import java.util.*;

public class BOJ26767 { // Hurra!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 77 == 0) {
                System.out.println("Wiwat!");
            } else if (i % 11 == 0) {
                System.out.println("Super!");
            } else if (i % 7 == 0) {
                System.out.println("Hurra!");
            } else {
                System.out.println(i);
            }
        }

        sc.close();
    }
}