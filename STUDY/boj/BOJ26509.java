package boj;
import java.util.*;

public class BOJ26509 { // Triangle

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] first_triangle = new int[3];
            int[] second_triangle = new int[3];

            for (int j = 0; j < 3; j++) {
                first_triangle[j] = sc.nextInt();
            }

            for (int j = 0; j < 3; j++) {
                second_triangle[j] = sc.nextInt();
            }

            Arrays.sort(first_triangle);
            Arrays.sort(second_triangle);
            boolean same = true;

            for (int j = 0; j < 3; j++) {
                if (first_triangle[j] != second_triangle[j]) {
                    same = false;
                }
            }

            if (Math.pow(first_triangle[0], 2) + Math.pow(first_triangle[1], 2) == Math.pow(first_triangle[2], 2) && same) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}