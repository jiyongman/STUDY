package boj;
import java.util.*;

public class BOJ27272 { // Пары

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = arr[0] * arr[1] + arr[2] * arr[3];

        System.out.println(max);
        sc.close();
    }
}