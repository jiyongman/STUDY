package boj;
import java.util.*;

public class BOJ11399 { // ATM

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람의 수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) { // 돈을 인출하는데 걸리는 시간
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 오름차순으로 정렬

        int sum = 0; // 이전까지의 대기시간 누적합
        int result = 0; // 대기시간 총 합

        for (int i = 0; i < N; i++) {
            result += sum + arr[i];
            sum += arr[i];
        }

        System.out.println(result);
        sc.close();
    }
}