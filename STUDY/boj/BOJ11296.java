package boj;
import java.util.*;

public class BOJ11296 { // 가격

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 구매자 수
        String[] arr = {"R", "G", "B", "Y", "O", "W"}; // 점의 색깔
        double[] arr2 = {45, 30, 20, 15, 10, 5}; // 할인 비율

        for (int i = 0; i < N; i++) {
            double d = sc.nextDouble(); // 모든 할인 전 품목의 가격
            String str = sc.next(); // 점의 색깔
            String str2 = sc.next(); // 쿠폰
            String str3 = sc.next(); // 결제
            double result = 0;

            for (int j = 0; j < 6; j++) {
                if (str.equals(arr[j])) {
                    result = d * (1 - (arr2[j] / 100));

                    if (str2.equals("C")) {
                        result *= 0.95;
                    }

                    if (str3.equals("C")) {
                        result -= 0.01;

                        System.out.printf("$%.2f\n", (double) Math.round(result * 10) / 10.0);
                    } else {
                        System.out.printf("$%.2f\n", result);
                    }
                }
            }


        }

        sc.close();
    }
}