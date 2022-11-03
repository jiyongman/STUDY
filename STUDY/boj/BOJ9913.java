package boj;
import java.util.*;

public class BOJ9913 { // Max

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of integers in the sequence
        int[] arr = new int[1001];

        for (int i = 0; i < N; i++) {
            arr[sc.nextInt()]++;
        }

        int max = 0;

        for (int i = 1; i <= 1000; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
        sc.close();
    }
}