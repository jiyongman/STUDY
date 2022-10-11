package boj;
import java.util.*;

public class BOJ25840 { // Sharing Birthdays

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of birthdays
        int[] arr = new int[1232];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int d = Integer.parseInt(str.substring(0, 2)) * 100 + Integer.parseInt(str.substring(3));
            arr[d]++;
        }

        int cnt = 0;

        for (int i = 101; i <= 1231; i++) {
            if (arr[i] > 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}