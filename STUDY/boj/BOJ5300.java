package boj;
import java.util.*;

public class BOJ5300 { // Fill the Rowboats!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d ", i);

            if (i % 6 == 0 || i == N) {
                System.out.print("Go! ");
            }
        }

        sc.close();
    }
}