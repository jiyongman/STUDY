package boj;
import java.util.*;

public class BOJ15130 { // Arithmetic Sequences

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = 0;
        int b = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 0 && cnt == 1) {
                b = i;
            } else if (arr[i] > 0) {
                a = i;
                cnt++;
            }
        }

        if ((arr[b] - arr[a]) % (b - a) != 0) {
            System.out.println(-1);
            return;
        }

        int d = (arr[b] - arr[a]) / (b - a);
        arr[0] = arr[a] - a * d;

        for (int i = 1; i < 10; i++) {
            arr[i] = arr[i - 1] + d;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", arr[i]);
        }

        sc.close();
    }
}