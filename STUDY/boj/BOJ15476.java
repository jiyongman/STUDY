package boj;
import java.util.*;

public class BOJ15476 { // 幹線道路 (Trunk Road)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] arr = new int[H + 1][W + 1];

        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                int sum = 0;

                for (int k = 1; k <= H; k++) {
                    for (int l = 1; l <= W; l++) {
                        sum += arr[k][l] * Math.min(Math.abs(i - k), Math.abs(j - l));
                    }
                }

                min = Math.min(min, sum);
            }
        }

        System.out.println(min);
        sc.close();
    }
}