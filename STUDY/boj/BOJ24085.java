package boj;
import java.util.*;

public class BOJ24085 { // 希少な数 (Rare Number)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2001];

        for (int i = 0; i < N; i++) {
            arr[sc.nextInt()]++;
        }

        int min = 2001;
        int result = 0;

        for (int i = 1; i <= 2000; i++) {
            if (arr[i] > 0) {
                if (min > arr[i]) {
                    min = arr[i];
                    result = i;
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}