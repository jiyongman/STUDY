package boj;
import java.util.*;

public class BOJ6751 { // From 1987 to 2013

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt(); // the starting year

        for (int i = Y + 1; i <= 10234; i++) {
            String str = String.valueOf(i);
            int[] arr = new int[10];

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - '0']++;
            }

            int cnt = 0;

            for (int j = 0; j < 10; j++) {
                if (arr[j] < 2) {
                    cnt++;
                }
            }

            if (cnt == 10) {
                System.out.println(str);
                break;
            }
        }

        sc.close();
    }
}