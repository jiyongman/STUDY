package boj;
import java.util.*;

public class BOJ17851 { // This Problem’s a Slam Dunk

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr2);
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if (arr[i] > arr2[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}