package boj;
import java.util.*;

public class BOJ25850 { // A Game Called Mind

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); // the number of players
        int[] arr = new int[10];
        int[] arr2 = new int[100];

        for (int i = 1; i <= p; i++) {
            int c = sc.nextInt();
            arr[i] = i; // the number of cards for that player

            for (int j = 0; j < c; j++) {
                arr2[sc.nextInt()] = arr[i];
            }
        }

        for (int i = 10; i < 100; i++) {
            for (int j = 1; j <= p; j++) {
                if (arr2[i] == arr[j]) {
                    System.out.print((char) (j + 64));
                }
            }
        }

        sc.close();
    }
}