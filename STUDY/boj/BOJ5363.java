package boj;
import java.util.*;

public class BOJ5363 { // 요다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine()); // 문장의 수

        for (int i = 0; i < N; i++) {
            String[] arr = sc.nextLine().split(" ");

            for (int j = 2; j < arr.length; j++) {
                System.out.printf("%s ", arr[j]);
            }

            for (int j = 0; j < 2; j++) {
                System.out.printf("%s ", arr[j]);
            }

            System.out.println();
        }

        sc.close();
    }
}