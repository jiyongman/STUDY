package boj;
import java.util.*;

public class BOJ26943 { // Turnering

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        r--;

        while (r > 0) {
            for (int i = 1; i <= n; i++) {
                if (i != n) {
                    arr[i] -= 1;

                    if (arr[i] == 0) {
                        arr[i] = n - 1;
                    }
                }
            }

            r--;
        }

        for (int i = 1; i <= n / 2; i++) {
            System.out.printf("%d-%d\n", arr[i], arr[n + 1 - i]);
        }

        sc.close();
    }
}