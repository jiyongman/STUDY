package boj;
import java.util.*;

public class BOJ2580 { // 스도쿠

    static int[][] arr = new int[9][9];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        backtracking(0, 0);
        sc.close();
    }

    public static boolean check(int x, int y, int k) {

        for (int i = 0; i < 9; i++) {
            if (arr[x][i] == k || arr[i][y] == k) {
                return false;
            }
        }

        int square_x = x / 3 * 3;
        int square_y = y / 3 * 3;

        for (int i = square_x; i < square_x + 3; i++) {
            for (int j = square_y; j < square_y + 3; j++) {
                if (arr[i][j] == k) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void backtracking(int x, int y) {

        if (y == 9) {
            backtracking(x + 1, 0);
            return;
        }

        if (x == 9) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }

            System.out.println(sb);
            System.exit(0);
        }

        if (arr[x][y] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (check(x, y, i)) {
                    arr[x][y] = i;
                    backtracking(x, y + 1);
                }
            }
            arr[x][y] = 0;
            return;
        }

        backtracking(x, y + 1);
    }
}