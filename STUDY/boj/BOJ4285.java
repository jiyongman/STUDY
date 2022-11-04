package boj;
import java.util.*;

public class BOJ4285 { // Prerequisites?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int k = sc.nextInt(); // the number of courses Freddie has chosen

            if (k == 0) {
                break;
            }

            int m = sc.nextInt(); // the number of categories
            int[] arr = new int[k];

            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt(); // the number of a course selected by Freddie
            }

            int result = 0;

            for (int i = 0; i < m; i++) {
                int c = sc.nextInt(); // the number of courses in the category
                int r = sc.nextInt(); // the minimum number of courses from the category that must be taken
                int cnt = 0;

                for (int j = 0; j < c; j++) {
                    int n = sc.nextInt();

                    for (int l = 0; l < k; l++) {
                        if (arr[l] == n) {
                            cnt++;
                        }
                    }
                }

                if (cnt >= r) {
                    result++;
                }
            }

            if (result == m) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}