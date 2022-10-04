package boj;
import java.util.*;

public class BOJ3040 { // 백설 공주와 일곱 난쟁이

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt(); // 일곱 난쟁이가 쓴 모자에 쓰여 있는 수
            sum += arr[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(arr[k]);
                        }
                    }
                }
            }
        }

        sc.close();
    }
}