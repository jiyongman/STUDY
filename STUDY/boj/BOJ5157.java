package boj;
import java.util.*;

public class BOJ5157 { // Bailout Bonus

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // the number of data sets

        for (int x = 1; x <= K; x++) {
            int C = sc.nextInt(); // the total number of companies
            int B = sc.nextInt(); // the number of these companies that were bailed out
            int n = sc.nextInt(); // the total number of executives
            int r = sc.nextInt(); // the taxation rate in percent
            int[] arr = new int[B];

            if (B > 0) {
                for (int j = 0; j < B; j++) {
                    arr[j] = sc.nextInt();
                }
            }

            int result = 0;

            for (int j = 0; j < n; j++) {
                int c = sc.nextInt();
                int p = sc.nextInt();

                for (int k = 0; k < B; k++) {
                    if (c == arr[k]) {
                        result += p * r / 100;
                    }
                }
            }

            System.out.println("Data Set " + x + ":");
            System.out.println(result);
            System.out.println();
        }

        sc.close();
    }   
}