package boj;
import java.util.*;

public class BOJ9635 { // Balloons Colors

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // the number of problems
            int X = sc.nextInt(); // the color which the easiest problem should not get
            int Y = sc.nextInt(); // the color which the hardest problem should not get
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }

            if (arr[0] == X && arr[N - 1] == Y) {
                System.out.println("BOTH");
            } else if (arr[0] == X) {
                System.out.println("EASY");
            } else if (arr[N - 1] == Y) {
                System.out.println("HARD");
            } else {
                System.out.println("OKAY");
            }
        }

        sc.close();
    }
}