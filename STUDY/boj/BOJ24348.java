package boj;
import java.util.*;

public class BOJ24348 { // ИЗРАЗ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long[] arr = new long[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        if (arr[1] == 0) {
            System.out.println(arr[2]);
        } else {
            System.out.println(arr[0] + arr[1] * arr[2]);
        }

        sc.close();
    }
}