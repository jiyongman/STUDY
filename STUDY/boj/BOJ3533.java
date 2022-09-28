package boj;
import java.util.*;

public class BOJ3533 { // Explicit Formula

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        boolean[] bl = new boolean[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 1) {
                bl[i] = true;
            } else {
                bl[i] = false;
            }
        }

        boolean result = (bl[0] || bl[1]);

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (i == 0 && j == 1) {
                    continue;
                }
                result ^= (bl[i] || bl[j]);
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                for (int k = j + 1; k < 10; k++) {
                    result ^= (bl[i] || bl[j] || bl[k]);
                }
            }
        }

        int result2 = 0;

        if (result) {
            result2 = 1;
        }

        System.out.println(result2);
        sc.close();
    }
}