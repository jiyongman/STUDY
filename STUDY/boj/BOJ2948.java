package boj;
import java.util.*;

public class BOJ2948 { // 2009년

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] arr2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int D = sc.nextInt(); // day
        int M = sc.nextInt(); // month
        int day = D;

        for (int i = 0; i < M - 1; i++) {
            day += arr[i];
        }

        int date = day % 7 + 2;

        if (date >= 7) {
            date -= 7;
        }

        System.out.println(arr2[date]);
        sc.close();
    }
}