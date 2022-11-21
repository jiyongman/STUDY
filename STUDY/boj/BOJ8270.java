package boj;
import java.util.*;

public class BOJ8270 { // Tulips

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of beds of tulips in the garden
        int[] arr = new int[15001];

        for (int i = 0; i < n; i++) {
            arr[sc.nextInt()]++; // the catalogue numbers of kinds of tulips that grow in the respective beds in the garden
        }

        int result = 15000; // the number of kinds of tulips

        for (int i = 1; i <= 15000; i++) {
            if (arr[i] > 0) {
                result--;
            }
        }

        System.out.println(result);
        sc.close();
    }
}