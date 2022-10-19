package boj;
import java.util.*;

public class BOJ9584 { // Fraud Busters

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // the code as recognized by the scanner
        int n = sc.nextInt(); // the number of vehicle registration codes from the vehicle registration database
        String[] arr = new String[n];
        int[] arr2 = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next(); // Vehicle registration codes
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '*') {
                    continue;
                }
                if (str.charAt(j) != arr[i].charAt(j)) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                arr2[i]++;
                sum++;
            }
        }

        System.out.println(sum);

        for (int i = 0; i < n; i++) {
            if (arr2[i] > 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}