package boj;
import java.util.*;

public class BOJ10643 { // FUNGHI

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt(); // the amount of mushrooms on pizza slices
        }

        arr[8] = arr[0];
        arr[9] = arr[1];
        arr[10] = arr[2];
        int max = 0;

        for (int i = 0; i < 8; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
            max = Math.max(max, sum);
        }

        System.out.println(max);
        sc.close();
    }
}