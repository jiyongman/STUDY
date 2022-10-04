package boj;
import java.util.*;

public class BOJ2592 { // 대표값

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[1001];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            arr2[arr[i]]++;
            sum += arr[i];
        }

        int avg = sum / 10;
        int max = 0;
        int result = 0;

        for (int i = 0; i <= 1000; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
                result = i;
            }
        }

        System.out.println(avg);
        System.out.println(result);
        sc.close();
    }
}