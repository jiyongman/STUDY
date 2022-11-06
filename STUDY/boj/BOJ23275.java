package boj;
import java.util.*;

public class BOJ23275 { // Knot Knowledge

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of knots Sonja needs to learn
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // the knots that Sonja needs to learn
        }

        for (int i = 0; i < n - 1; i++) {
            int y = sc.nextInt(); // the knots that Sonja has learned so far

            for (int j = 0; j < n; j++) {
                if (arr[j] > 0) {
                    if (arr[j] == y) {
                        arr[j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
                break;
            }
        }

        sc.close();
    }
}