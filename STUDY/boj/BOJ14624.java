package boj;
import java.util.*;

public class BOJ14624 { // 전북대학교

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 2 > 0) {
            for (int i = 0; i < N; i++) {
                System.out.print("*");
            }

            System.out.println();

            for (int i = 0; i < N / 2; i++) {
                System.out.print(" ");
            }

            System.out.println("*");

            for (int i = 1; i < N / 2 + 1; i++) {
                for (int j = 0; j < N / 2 - i; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }
        } else {
            System.out.println("I LOVE CBNU");
        }
        
        sc.close();
    }
}