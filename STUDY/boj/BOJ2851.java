package boj;
import java.util.*;

public class BOJ2851 { // 슈퍼 마리오

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt(); // 버섯의 점수
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += arr[i];

            if (sum >= 100) {
                if (sum - 100 > 100 - (sum - arr[i])) {
                    sum -= arr[i];
                }

                break;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}