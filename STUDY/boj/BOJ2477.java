package boj;
import java.util.*;

public class BOJ2477 { // 참외밭

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[][] arr = new int[6][2];
        int east_or_west_max = 0;
        int south_or_north_max = 0;
        int east_or_west_max_i = 0;
        int south_or_north_max_i = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }

            if (arr[i][0] <= 2) {
                if (east_or_west_max < arr[i][1]) {
                    east_or_west_max = arr[i][1];
                    east_or_west_max_i = i;
                }
            } else {
                if (south_or_north_max < arr[i][1]) {
                    south_or_north_max = arr[i][1];
                    south_or_north_max_i = i;
                }
            }
        }

        int big_square = east_or_west_max * south_or_north_max;
        int small_square = arr[(east_or_west_max_i + 3) % 6][1] * arr[(south_or_north_max_i + 3)% 6][1];
        int result = K * (big_square - small_square);

        System.out.println(result);
        sc.close();
    }
}