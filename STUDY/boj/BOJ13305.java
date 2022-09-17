package boj;
import java.util.*;

public class BOJ13305 { // 주유소

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 도시의 개수
        long[] arr = new long[N - 1]; // 도로의 길이
        long[] arr2 = new long[N]; // 주유소의 리터당 가격

        for (int i = 0; i < N - 1; i++) { // 도로의 길이 입력
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < N; i++) { // 주유소의 리터당 가격 입력
            arr2[i] = sc.nextLong();
        }

        long sum = 0;
        long min = arr2[0];

        for (int i = 0; i < N - 1; i++) {
            if (arr2[i] < min) { // 현재 주유소가 이전 주유소보다 리터당 가격이 저렴한 경우 min을 갱신
                min = arr2[i];
            }
            sum += (min * arr[i]); // 총 가격 누적 합
        }

        System.out.println(sum);
        sc.close();
    }
}