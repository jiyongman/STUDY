package boj;
import java.util.*;

public class BOJ6811 { // Old Fishin’ Hole

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // the trout points
        int b = sc.nextInt(); // the pike points
        int c = sc.nextInt(); // the pickerel points
        int d = sc.nextInt(); // the total points
        int cnt = 0;

        for (int i = 0; i <= d; i++) {
            for (int j = 0; j <= d; j++) {
                for (int k = 0; k <= d; k++) {
                    if (i + j + k > 0) {
                        if (a * i + b * j + c * k <= d) {
                            System.out.printf("%d Brown Trout, %d Northern Pike, %d Yellow Pickerel\n", i, j, k);
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.printf("Number of ways to catch fish: %d", cnt);
        sc.close();
    }
}