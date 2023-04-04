package boj;
import java.util.*;

public class BOJ6251 { // Leaking Dike

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int[] height = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                height[i] = sc.nextInt();
            }

            int number = sc.nextInt();
            int result = 0;

            for (int i = 1; i <= n; i++) {
                result += Math.abs(height[i] - (height[number] + 1));
            }

            System.out.println(result);
        }

        sc.close();
    }
}