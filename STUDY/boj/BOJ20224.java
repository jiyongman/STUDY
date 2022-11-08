package boj;
import java.util.*;

public class BOJ20224 { // Count Down Up 2020

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }

            int cnt = 0;

            for (int i = 3; i < n; i++) {
                if (arr[i - 3].equals("2") && arr[i - 2].equals("0") && arr[i - 1].equals("2") && arr[i].equals("0")) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}