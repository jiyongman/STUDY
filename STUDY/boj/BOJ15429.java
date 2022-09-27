package boj;
import java.util.*;

public class BOJ15429 { // Odd Gnome

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of gnome groups

        for (int i = 0; i < n; i++) {
            int g = sc.nextInt(); // the number of gnomes in that group
            int[] arr = new int[g];

            for (int j = 0; j < g; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < g - 1; j++) {
                if (arr[j + 1] - arr[j] != 1) {
                    System.out.println(j + 2);
                    break;
                }
            }
        }

        sc.close();
    }
}