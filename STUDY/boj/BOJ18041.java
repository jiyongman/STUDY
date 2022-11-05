package boj;
import java.util.*;

public class BOJ18041 { // Mountain Ranges

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of scenic viewpoints on the hiking trail
        int X = sc.nextInt(); // the maximum number of meters that Lola and her husband are willing to go up from one viewpoint to the next
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int max = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i] - arr[i - 1] <= X) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }
        }

        max = Math.max(max, cnt);

        System.out.println(max);
        sc.close();
    }
}