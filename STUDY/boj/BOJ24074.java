package boj;
import java.util.*;

public class BOJ24074 { // 分割 (Split)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        int tmp = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i]) {
                max = arr[i];
                tmp = i;
            }
        }

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < N; i++) {
            if (i < tmp) {
                sum += arr[i];
            } else if (i > tmp) {
                sum2 += arr[i];
            }
        }

        System.out.println(sum);
        System.out.println(sum2);
        sc.close();
    }
}