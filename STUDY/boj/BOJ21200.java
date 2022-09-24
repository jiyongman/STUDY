package boj;
import java.util.*;

public class BOJ21200 { // Forced Choice

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of cards
        int P = sc.nextInt(); // the secret prediction
        int S = sc.nextInt(); // the number of steps

        for (int i = 0; i < S; i++) {
            int m = sc.nextInt(); // the number of cards chosen
            int[] arr = new int[m];
            int cnt = 0;

            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();

                if (arr[j] == P) {
                    cnt++;
                }
            }

            if (cnt > 0) {
                System.out.println("KEEP");
            } else {
                System.out.println("REMOVE");
            }
        }

        sc.close();
    }
}