package boj;
import java.util.*;

public class BOJ25932 { // Find the Twins

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets
        int[][] arr = new int[n][10];

        for (int i = 0; i < n; i++) {
            int mack = 0;
            int zack = 0;

            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt(); // the jersey numbers for the players

                if (arr[i][j] == 18) {
                    mack++;
                } else if (arr[i][j] == 17) {
                    zack++;
                }

                System.out.printf("%d ", arr[i][j]);
            }

            System.out.println();

            if (mack > 0 && zack > 0) {
                System.out.println("both");
            } else if (mack > 0) {
                System.out.println("mack");
            } else if (zack > 0) {
                System.out.println("zack");
            } else {
                System.out.println("none");
            }

            System.out.println();
        }

        sc.close();
    }
}