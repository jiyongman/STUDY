package boj;
import java.util.*;

public class BOJ16032 { // Income Inequality

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt(); // the number of people

            if (n == 0) {
                break;
            }

            int[] arr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // incomes of n people
                sum += arr[i];
            }

            int avg = sum / n;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] <= avg) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}