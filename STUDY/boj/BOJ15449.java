package boj;
import java.util.*;

public class BOJ15449 { // Art

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int cnt = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    if (arr[i] + arr[j] > arr[k]) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}