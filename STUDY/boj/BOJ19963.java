package boj;
import java.util.*;

public class BOJ19963 { // Санта Клаус

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of children
        int m = sc.nextInt(); // the number of gifts in the first bag
        int k = sc.nextInt(); // the number of gifts in the second bag
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(); // the numbers of children whose gifts are in the first bag
            arr[x - 1] = 0;
        }

        for (int i = 0; i < k; i++) {
            int y = sc.nextInt(); // the numbers of children whose gifts are in the second bag
            arr[y - 1] = 0;
        }

        int a = n - (m + k); // how many gifts should be in the third bag

        System.out.println(a);

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}