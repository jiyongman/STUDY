package boj;
import java.util.*;

public class BOJ24420 { // ピアノコンクール (Piano Competition)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of judges
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // the score of early summer
        }

        Arrays.sort(arr);
        int sum = 0; // the total score of early summer

        for (int i = 1; i < N - 1; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        sc.close();
    }
}