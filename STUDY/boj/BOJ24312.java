package boj;
import java.util.*;

public class BOJ24312 { // ДИНИ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt(); // the weights in kilograms of each of the watermelons
        }

        Arrays.sort(arr);

        if (Math.abs(arr[0] + arr[3] - (arr[1] + arr[2])) < Math.abs(arr[0] + arr[1] + arr[2] - arr[3])) {
            System.out.println(Math.abs(arr[0] + arr[3] - (arr[1] + arr[2])));
        } else {
            System.out.println(Math.abs(arr[0] + arr[1] + arr[2] - arr[3]));
        }

        sc.close();
    }
}