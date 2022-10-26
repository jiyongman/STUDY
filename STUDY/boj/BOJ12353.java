package boj;
import java.util.*;

public class BOJ12353 { // Dr. Spaceman의 특별한 알고리즘

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // 테스트 케이스의 개수

        for (int x = 1; x <= T; x++) {
            String[] arr = sc.nextLine().split(" ");
            int f = 0; // 엄마의 키(feet)
            int i = 0; // 엄마의 키(inch)
            int f2 = 0; // 아빠의 키(feet)
            int i2 = 0; // 아빠의 키(inch)

            if (arr[1].length() == 4) {
                f = Integer.parseInt(arr[1].substring(0, 1));
                i = Integer.parseInt(arr[1].substring(2, 3));
            } else {
                f = Integer.parseInt(arr[1].substring(0, 1));
                i = Integer.parseInt(arr[1].substring(2, 4));
            }

            if (arr[2].length() == 4) {
                f2 = Integer.parseInt(arr[2].substring(0, 1));
                i2 = Integer.parseInt(arr[2].substring(2, 3));
            } else {
                f2 = Integer.parseInt(arr[2].substring(0, 1));
                i2 = Integer.parseInt(arr[2].substring(2, 4));
            }

            int sum = f * 12 + i + f2 * 12 + i2;

            if (arr[0].equals("B")) {
                sum += 5;
            } else {
                sum -= 5;
            }

            String A = String.format("%d'%d\"", (sum / 2 + sum % 2 - 4) / 12, ((sum / 2 + sum % 2 - 4) % 12)); // 아이의 키의 최솟값
            String B = String.format("%d'%d\"", (sum / 2 + 4) / 12, ((sum / 2 + 4) % 12)); // 아이의 키의 최댓값

            System.out.printf("Case #%d: %s to %s\n", x, A, B);
        }

        sc.close();
    }
}