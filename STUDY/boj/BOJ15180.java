package boj;
import java.util.*;

public class BOJ15180 { // Fitness

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // the starting station
        int[] arr = new int[9];
        arr[0] = S;
        int i = 1;

        System.out.printf("%d ", arr[0]);

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            if (str.charAt(0) == 'A') {
                arr[i] = arr[i - 1] - (str.charAt(1) - '0');
            } else {
                arr[i] = arr[i - 1] + (str.charAt(1) - '0');
            }

            if (arr[i] < 1) {
                arr[i] += 8;
            } else if (arr[i] > 8) {
                arr[i] -= 8;
            }

            System.out.printf("%d ", arr[i]);
            i++;
        }

        int[] arr2 = new int[9];

        for (int j = 0; j < i; j++) {
            arr2[arr[j]]++;
        }

        int cnt = 0;

        for (int j = 1; j <= 8; j++) {
            if (arr2[j] > 1) {
                cnt++;
            }
        }

        if (i < 5 || cnt > 0) {
            System.out.print("reject");
        }

        sc.close();
    }
}