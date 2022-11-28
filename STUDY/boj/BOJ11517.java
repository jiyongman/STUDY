package boj;
import java.util.*;

public class BOJ11517 { // Positive Con Sequences

    public static int[] arr = new int[4];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }

            if (arr[0] == -1 && arr[1] == -1 && arr[2] == -1 && arr[3] == -1) {
                break;
            }

            int i;
            for (i = 0; arr[i] != -1; i++);

            int result = -1;

            for (arr[i] = 1; arr[i] <= 10000; arr[i]++) {
                if (arithmetic() || geometric()) {
                    result = arr[i];
                    break;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }

    public static boolean arithmetic() {

        int d = arr[1] - arr[0];

        for (int i = 1; i < 4; i++) {
            if (arr[i] != arr[i - 1] + d) {
                return false;
            }
        }

        return true;
    }

    public static boolean geometric() {

        int r = arr[1] / arr[0];

        for (int i = 1; i < 4; i++) {
            if (arr[i] != arr[i - 1] * r) {
                return false;
            }
        }

        return true;
    }
}