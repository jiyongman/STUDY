package boj;
import java.util.*;

public class BOJ6769 { // Aromatic Numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int[] A = {1, 5, 10, 50, 100, 500, 1000};
        char[] R = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int sum = 0;
        int before_a = 0;
        int before_r = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 0; j < 7; j++) {
                if (arr[i + 1] == R[j]) {
                    sum += (arr[i] - '0') * A[j];

                    if (A[j] > before_r) {
                        sum -= 2 * before_a * before_r;
                    }

                    before_a = arr[i] - '0';
                    before_r = A[j];
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}