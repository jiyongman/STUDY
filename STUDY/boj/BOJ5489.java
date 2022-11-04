package boj;
import java.util.*;

public class BOJ5489 { // Numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[10001];

        for (int i = 0; i < N; i++) {
            arr[sc.nextInt()]++;
        }

        int max = 0;

        for (int i = 1; i <= 10000; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (arr[i] == max) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}