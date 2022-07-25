package boj;
import java.util.*;

public class BOJ10039 { // 평균 점수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if (arr[i] < 40) {
                arr[i] = 40;
            }
            sum += arr[i];
        }

        System.out.println(sum / 5);
        sc.close();
    }
}