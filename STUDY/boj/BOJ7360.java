package boj;
import java.util.*;

public class BOJ7360 { // Undercut

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // player A's card plays
            }

            int[] arr2 = new int[n];
            int a = 0;
            int b = 0;

            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt(); // player B's card plays

                if (Math.abs(arr[i] - arr2[i]) == 1) {
                    if (arr[i] == 1 && arr2[i] == 2) {
                        a += 6;
                    } else if (arr[i] == 2 && arr2[i] == 1) {
                        b += 6;
                    } else {
                        if (arr[i] < arr2[i]) {
                            a += arr[i] + arr2[i];
                        } else {
                            b += arr[i] + arr2[i];
                        }
                    }
                } else if (Math.abs(arr[i] - arr2[i]) > 1) {
                    if (arr[i] > arr2[i]) {
                        a += arr[i];
                    } else {
                        b += arr2[i];
                    }
                }
            }

            System.out.printf("A has %d points. B has %d points.\n\n", a, b);
        }

        sc.close();
    }
}