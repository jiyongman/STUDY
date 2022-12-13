package boj;
import java.util.*;

public class BOJ5778 { // Fake tickets

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt(); // the number of original tickets
            int M = sc.nextInt(); // the number of persons attending the party

            if (N == 0 && M == 0) {
                break;
            }

            int[] arr = new int[N + 1];

            for (int i = 0; i < M; i++) {
                arr[sc.nextInt()]++;
            }

            int cnt = 0;

            for (int i = 1; i <= N; i++) {
                if (arr[i] > 1) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}