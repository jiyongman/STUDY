package boj;
import java.util.*;

public class BOJ18154 { // Speeding

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of photographs taken
        int t = sc.nextInt(); // the time of the first photograph
        int d = sc.nextInt(); // the distance of the first photograph
        int max = 0;

        for (int i = 1; i < N; i++) {
            int ti = sc.nextInt();
            int di = sc.nextInt();

            if (max < (di - d) / (ti - t)) {
                max = (di - d) / (ti - t);
            }

            t = ti;
            d = di;
        }

        System.out.println(max);
        sc.close();
    }
}