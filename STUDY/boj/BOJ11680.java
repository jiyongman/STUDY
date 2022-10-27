package boj;
import java.util.*;

public class BOJ11680 { // Dice Cup

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of faces of the first dice
        int M = sc.nextInt(); // the number of faces of the second dice
        int[] arr = new int[N + M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                arr[i + j]++;
            }
        }

        int max = 0;

        for (int i = 1; i <= N + M; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 1; i <= N + M; i++) {
            if (arr[i] == max) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}