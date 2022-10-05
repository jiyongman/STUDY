package boj;
import java.util.*;

public class BOJ2979 { // 트럭 주차

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 트럭을 한 대 주차할 때 한 대당 주차 요금
        int B = sc.nextInt(); // 트럭을 두 대 주차할 때 한 대당 주차 요금
        int C = sc.nextInt(); // 트럭을 세 대 주차할 때 한 대당 주차 요금
        int[] arr = new int[101];

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt(); // 트럭이 주차장에 도착한 시간
            int l = sc.nextInt(); // 트럭이 주차장에서 떠난 시간

            for (int j = a + 1; j <= l; j++) {
                arr[j]++;
            }
        }

        int result = 0;

        for (int i = 1; i <= 100; i++) {
            if (arr[i] == 1) {
                result += A;
            } else if (arr[i] == 2) {
                result += B * 2;
            } else if (arr[i] == 3) {
                result += C * 3;
            }
        }

        System.out.println(result);
        sc.close();
    }
}