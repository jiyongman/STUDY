package boj;
import java.util.*;

public class BOJ26583 { // Scale

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(" ");
            int[] arr2 = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                arr2[i] = Integer.parseInt(arr[i]);
            }

            int[] arr3 = new int[arr2.length];

            arr3[0] = arr2[0] * arr2[1];

            for (int i = 1; i < arr2.length - 1; i++) {
                arr3[i] = arr2[i - 1] * arr2[i] * arr2[i + 1];
            }

            arr3[arr2.length - 1] = arr2[arr2.length - 2] * arr2[arr2.length - 1];

            for (int i = 0; i < arr3.length; i++) {
                System.out.printf("%d ", arr3[i]);
            }

            System.out.println();
        }

        sc.close();
    }
}