package boj;
import java.util.*;

public class BOJ25053 { // Organizing SWERC

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // how many problems Gianni received from the judges
            int[] arr = new int[11];

            for (int j = 0; j < n; j++) {
                int b = sc.nextInt(); // the beauty score
                int d = sc.nextInt(); // the difficulty of the j-th problem

                arr[d] = Math.max(arr[d], b);
            }

            int cnt = 0;
            int sum = 0;

            for (int j = 1; j <= 10; j++) {
                if (arr[j] == 0) {
                    cnt++;
                }

                sum += arr[j];
            }

            if (cnt == 0) {
                System.out.println(sum);
            } else {
                System.out.println("MOREPROBLEMS");
            }
        }

        sc.close();
    }
}