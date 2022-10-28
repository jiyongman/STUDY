package boj;
import java.util.*;

public class BOJ4118 { // Fred’s Lotto Tickets

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt(); // the number of tickets Fred has purchased

            if (N == 0) {
                break;
            }

            int[] arr = new int[50];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 6; j++) {
                    arr[sc.nextInt()]++;
                }
            }

            int cnt = 0;

            for (int i = 1; i <= 49; i++) {
                if (arr[i] > 0) {
                    cnt++;
                }
            }

            if (cnt == 49) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}