package boj;
import java.util.*;

public class BOJ14535 { // Birthday Graph

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int x = 1;

        while (true) {
            int N = sc.nextInt(); // the number of data in the test case

            if (N == 0) {
                break;
            }

            String[] arr2 = {"", "", "", "", "", "", "", "", "", "", "", "", ""};

            for (int i = 0; i < N; i++) {
                int d = sc.nextInt(); // day
                int m = sc.nextInt(); // month
                int y = sc.nextInt(); // year

                for (int j = 0; j < 12; j++) {
                    if (m == j + 1) {
                        arr2[j] += "*";
                    }
                }
            }

            System.out.printf("Case #%d:\n", x);
            x++;

            for (int i = 0; i < 12; i++) {
                System.out.println(arr[i] + ":" + arr2[i]);
            }
        }
        
        sc.close();
    }
}