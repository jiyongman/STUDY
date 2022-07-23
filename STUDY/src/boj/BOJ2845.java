package boj;
import java.util.*;

public class BOJ2845 { // 파티가 끝나고 난 뒤

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 1m^2당 사람의 수
        int P = sc.nextInt(); // 파티가 열렸던 곳의 넓이
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] - (L * P) + " ");
        }

        sc.close();
    }
}