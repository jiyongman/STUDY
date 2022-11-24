package boj;
import java.util.*;

public class BOJ10501 { // Ragged Right

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int n = 0; // the length, measured in characters, of the longest line of the paragraph
        int i = 0;
        int cnt = 0;

        while (sc.hasNextLine()) {
            arr[i] = sc.nextLine().length();
            n = Math.max(n, arr[i]);
            i++;
            cnt++;
        }

        int sum = 0; // the sum of the penalty scores

        for (int j = 0; j < cnt - 1; j++) {
            int m = arr[j];
            sum += (n - m) * (n - m);
        }

        System.out.println(sum);
        sc.close();
    }
}