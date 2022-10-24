package boj;
import java.util.*;

public class BOJ16408 { // Poker Hand

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[14];

        for (int i = 0; i < 5; i++) {
            String str = sc.next();

            if (str.charAt(0) == 'A') {
                arr[1]++;
            } else if (str.charAt(0) >= '2' && str.charAt(0) <= '9') {
                arr[str.charAt(0) - '0']++;
            } else if (str.charAt(0) == 'T') {
                arr[10]++;
            } else if (str.charAt(0) == 'J') {
                arr[11]++;
            } else if (str.charAt(0) == 'Q') {
                arr[12]++;
            } else {
                arr[13]++;
            }
        }

        int max = 0;

        for (int i = 0; i < 14; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
        sc.close();
    }
}