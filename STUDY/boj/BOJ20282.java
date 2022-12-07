package boj;
import java.util.*;

public class BOJ20282 { // Game Show!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int sum = 100;
        int max = 100;

        for (int i = 0; i < C; i++) {
            int V = sc.nextInt();
            sum += V;

            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
        sc.close();
    }
}