package boj;
import java.util.*;

public class BOJ23037 { // 5의 수난

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = str.charAt(i) - '0'; // 문자형을 정수형으로 변환
        }

        for (int i = 0; i < 5; i++) {
            sum += Math.pow(arr[i], 5);
        }

        System.out.println(sum);
        sc.close();
    }
}