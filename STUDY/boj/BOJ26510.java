package boj;
import java.util.*;

public class BOJ26510 { // V for Vendetta

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int j = 0; j < 2 * N - 2 * i - 3; j++) {
                    System.out.print(" ");
                }

                if (i == N - 1) {
                    System.out.println();
                } else {
                    System.out.println("*");
                }
            }
        }

        sc.close();
    }
}