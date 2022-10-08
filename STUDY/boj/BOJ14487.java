package boj;
import java.util.*;

public class BOJ14487 { // 욱제는 효도쟁이야!!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 마을의 수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        sc.close();
    }
}