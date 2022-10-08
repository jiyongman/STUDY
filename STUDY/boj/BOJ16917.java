package boj;
import java.util.*;

public class BOJ16917 { // 양념 반 후라이드 반

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 양념 치킨 한 마리의 가격
        int B = sc.nextInt(); // 후라이드 치킨 한 마리의 가격
        int C = sc.nextInt(); // 반반 치킨 한 마리의 가격
        int X = sc.nextInt(); // 구매해야 하는 최소 양념 치킨 마리 수
        int Y = sc.nextInt(); // 구매해야 하는 최소 후라이드 치킨 마리 수
        int result = 0;

        if (A + B <= 2 * C) {
            result += A * X + B * Y;
        } else {
            if (X >= Y) {
                result += 2 * C * Y + Math.min(A * (X - Y), 2 * C * (X - Y));
            } else {
                result += 2 * C * X + Math.min(B * (Y - X), 2 * C * (Y - X));
            }
        }

        System.out.println(result);
        sc.close();
    }
}