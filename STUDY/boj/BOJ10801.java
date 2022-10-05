package boj;
import java.util.*;

public class BOJ10801 { // 카드게임

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt(); // A가 제시한 카드의 숫자
        }

        int A = 0;
        int B = 0;

        for (int i = 0; i < 10; i++) {
            arr2[i] = sc.nextInt(); // B가 제시한 카드의 숫자

            if (arr[i] > arr2[i]) {
                A++;
            } else if (arr[i] < arr2[i]) {
                B++;
            }
        }

        if (A > B) {
            System.out.println("A");
        } else if (A < B) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }

        sc.close();
    }
}