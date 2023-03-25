package boj;
import java.util.*;

public class BOJ10372 { // Alarm Clock

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                if (arr[h / 10] + arr[h % 10] + arr[m / 10] + arr[m % 10] == n) {
                    System.out.printf("%02d:%02d\n", h, m);
                    return;
                }
            }
        }

        System.out.println("Impossible");
        sc.close();
    }
}