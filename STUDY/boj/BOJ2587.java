package boj;
import java.util.*;

public class BOJ2587 { // 대표값2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int avg = sum / 5;
        Arrays.sort(arr);

        System.out.println(avg);
        System.out.println(arr[2]);
        sc.close();
    }
}