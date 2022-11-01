package boj;
import java.util.*;

public class BOJ20660 { // Pizza

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of toppings
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // the labels of toppings Mirko dislikes
        }

        int m = sc.nextInt(); // the number of pizzas
        int tmp = 0;

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt(); // the number of toppings
            int cnt = 0;

            for (int j = 0; j < k; j++) {
                int b = sc.nextInt(); // the labels of toppings on the j-th pizza

                for (int l = 0; l < n; l++) {
                    if (b == arr[l]) {
                        cnt++;
                    }
                }
            }

            if (cnt > 0) {
                tmp++;
            }
        }

        int result = m - tmp;

        System.out.println(result);
        sc.close();
    }
}