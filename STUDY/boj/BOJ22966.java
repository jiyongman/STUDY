package boj;
import java.util.*;

public class BOJ22966 { // 가장 쉬운 문제를 찾는 문제

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문제의 개수
        String[] arr = new String[N];
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next(); // 문제 제목
            arr2[i] = sc.nextInt(); // 문제 난이도
        }

        int min = 5;
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
                result = i;
            }
        }

        System.out.println(arr[result]);
        sc.close();
    }
}