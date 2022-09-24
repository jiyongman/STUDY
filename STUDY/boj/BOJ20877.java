package boj;
import java.util.*;

public class BOJ20877 { // Minigolf

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of lanes
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // the number of strokes you used on each course

            if (arr[i] >= 7) {
                arr[i] = 7;
            }
        }

        int score = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                score += arr[i] - 2;
            } else {
                score += arr[i] - 3;
            }
        }

        System.out.println(score);
        sc.close();
    }
}