package boj;
import java.util.*;

public class BOJ21679 { // Клавиатура

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of keys on the keyboard
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // the number of key presses maintained by the i-th key
        }

        int k = sc.nextInt(); // the number of clicks

        for (int i = 0; i < k; i++) {
            int p = sc.nextInt(); // the sequence of pressed keys
            
            for (int j = 0; j < n; j++) {
                if (j == p - 1) {
                    arr[j]--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}