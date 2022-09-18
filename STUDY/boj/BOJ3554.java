package boj;
import java.util.*;

public class BOJ3554 { // Enigmatic Device

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the length of the sequence
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // forming the initial sequence
        }

        int m = sc.nextInt(); // the number of operations

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = 0;

            if (k == 1) {
                for (int j = l - 1; j < r; j++) {
                    a[j] = (a[j] * a[j]) % 2010;
                }
            } else {
                for (int j = l - 1; j < r; j++) {
                    sum += a[j];
                }
                System.out.println(sum);
            }
        }

        sc.close();
    }
}