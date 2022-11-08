package boj;
import java.util.*;

public class BOJ15035 { // I Work All Day

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of settings
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // the possible settings
        }

        int T = sc.nextInt(); //the height of the tree
        int min = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (min > T % arr[i]) {
                min = T % arr[i];
                result = arr[i];
            }
        }

        System.out.println(result);
        sc.close();
    }
}