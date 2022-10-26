package boj;
import java.util.*;

public class BOJ7286 { // Ancient Keyboard

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[1001];

            for (int j = 0; j < n; j++) {
                String str = sc.next(); // the key pressed
                int a = sc.nextInt(); // the first time step at which the key is pressed
                int b = sc.nextInt(); // the second time step at which the key is pressed

                for (int k = a; k < b; k++) {
                    arr[k]++;
                }
            }

            for (int j = 0; j <= 1000; j++) {
                if (arr[j] > 0) {
                    System.out.print((char) (arr[j] + 64));
                }
            }

            System.out.println();
        }

        sc.close();
    }
}