package boj;
import java.util.*;

public class BOJ8725 { // Szachy

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the height and width of the board
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int max = 0;

            for (int j = 0; j < n; j++) {
                max = Math.max(arr[i][j], max);
            }

            sum += max;
        }

        System.out.println(sum);
        sc.close();
    }
}