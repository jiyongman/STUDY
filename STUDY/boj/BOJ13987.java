package boj;
import java.util.*;

public class BOJ13987 { // Six Sides

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt(); // the values written on the first player’s die
        }

        int[] arr2 = new int[6];

        for (int i = 0; i < 6; i++) {
            arr2[i] = sc.nextInt(); // the values on the second player’s die in the same format
        }

        double a = 0;
        double b = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[i] > arr2[j]) {
                    a++;
                } else if (arr[i] < arr2[j]) {
                    b++;
                }
            }
        }

        System.out.printf("%.5f", a / (a + b));
        sc.close();
    }
}