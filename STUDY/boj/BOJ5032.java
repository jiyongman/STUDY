package boj;
import java.util.*;

public class BOJ5032 { // 탄산 음료

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt(); // 준민이가 가지고 있는 빈 병의 수
        int f = sc.nextInt(); // 그날 발견한 빈 병의 수
        int c = sc.nextInt(); // 새 병으로 바꾸는데 필요한 빈 병의 개수
        int n = e + f; // 준민이가 가지고 있는 빈 병의 총 개수
        int result = n / c;

        while (true) {
            if (n < c) {
                break;
            }

            n = n / c + n % c;
            result += n / c;
        }

        System.out.println(result);
        sc.close();
    }
}