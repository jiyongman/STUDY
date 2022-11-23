package boj;
import java.util.*;

public class BOJ15155 { // Analysis of Advanced Analytics

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of days in the semester
        int k = sc.nextInt(); // the number of pages in each notebook
        int sum = 0;
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // the number of pages needed for the i th day in the semester
            sum += a;

            if (sum > k) {
                sum = a;
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}