package boj;
import java.util.*;

public class BOJ27335 { // 年齢の差 (Age Difference)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] age = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            age[i] = sc.nextInt();
            max = Math.max(max, age[i]);
            min = Math.min(min, age[i]);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(Math.max(max - age[i], age[i] - min));
        }

        sc.close();
    }
}