package boj;
import java.util.*;

public class BOJ5919 { // Hay Bales

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of piles
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // the number of hay bales in a single pile
            sum += arr[i];
        }

        int avg = sum / N;
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] > avg) {
                result += arr[i] - avg;
            }
        }

        System.out.println(result);
        sc.close();
    }
}