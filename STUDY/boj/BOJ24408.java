package boj;
import java.util.*;

public class BOJ24408 { // Mult!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the length of the number sequence
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] % arr[0] == 0) {
                System.out.println(arr[i]);
                i++;

                if (i < n) {
                    arr[0] = arr[i];
                }
            }
        }

        sc.close();
    }   
}