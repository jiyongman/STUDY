package boj;
import java.util.*;

public class BOJ6889 { // Smile with Similes

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        String[] arr2 = new String[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%s as %s\n", arr[i], arr2[j]);
            }
        }

        sc.close();
    }
}