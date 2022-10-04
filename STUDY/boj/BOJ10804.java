package boj;
import java.util.*;

public class BOJ10804 { // 카드 역배치

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[21];

        for (int i = 1; i <= 20; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = a;
            int m = b;

            for (int j = 0; j <= (b - a) / 2; j++) {
                int tmp = arr[n];
                arr[n] = arr[m];
                arr[m] = tmp;
                n++;
                m--;
            }
        }

        for (int i = 1; i <= 20; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}