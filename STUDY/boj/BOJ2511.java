package boj;
import java.util.*;

public class BOJ2511 { // 카드놀이

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int A = 0;
        int B = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            arr2[i] = sc.nextInt();

            if (arr[i] > arr2[i]) {
                A += 3;
                cnt = 1;
            } else if (arr[i] < arr2[i]) {
                B += 3;
                cnt = 2;
            } else {
                A++;
                B++;
            }
        }

        System.out.printf("%d %d\n", A, B);

        if (A > B) {
            System.out.println("A");
        } else if (A < B) {
            System.out.println("B");
        } else {
            if (cnt == 1) {
                System.out.println("A");
            } else if (cnt == 2) {
                System.out.println("B");
            } else {
                System.out.println("D");
            }
        }

        sc.close();
    }
}