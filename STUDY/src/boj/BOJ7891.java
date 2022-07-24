package boj;
import java.util.*;

public class BOJ7891 { // Can you add this?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases
        int[][] arr = new int[t][2];

        for (int i = 0; i < t; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < t; i++) {
            sum = arr[i][0] + arr[i][1];
            System.out.println(sum);
        }

        sc.close();
    }
}