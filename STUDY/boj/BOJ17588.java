package boj;
import java.util.*;

public class BOJ17588 { // Missing Numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of child recited
        int[] arr = new int[n];
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // the child recited
            tmp = arr[i];
        }

        int[] arr2 = new int[tmp];

        for (int i = 0; i < n; i++) {
            arr2[arr[i] - 1] = 1;
        }

        int cnt = 0;

        for (int i = 0; i < tmp; i++) {
            if (arr2[i] == 1) {
                cnt++;
            } else {
                System.out.println(i + 1);
            }
        }

        if (cnt == tmp) {
            System.out.println("good job");
        }

        sc.close();
    }
}