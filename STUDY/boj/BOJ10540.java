package boj;
import java.util.*;

public class BOJ10540 { // KLOPKA

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of spotted mosquitoes
        int min = 101;
        int min2 = 101;
        int max = 0;
        int max2 = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (min > X) {
                min = X;
            }
            if (max < X) {
                max = X;
            }

            if (min2 > Y) {
                min2 = Y;
            }
            if (max2 < Y) {
                max2 = Y;
            }
        }

        int result = Math.max((max - min) * (max - min), (max2 - min2) * (max2 - min2));

        System.out.println(result);
        sc.close();
    }
}