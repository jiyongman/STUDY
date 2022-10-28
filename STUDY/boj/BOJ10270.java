package boj;
import java.util.*;

public class BOJ10270 { // Algebraic Teamwork

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases
        long[] arr = new long[100001];
        arr[1] = 1;

        for (int i = 2; i <= 100000; i++) {
            arr[i] = arr[i - 1] * i;
            arr[i] %= 1000000007;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(arr[sc.nextInt()] - 1);
        }

        sc.close();
    }
}