package boj;
import java.util.*;

public class BOJ24310 { // БОЯДИСВАНЕ НА ОГРАДА

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (A > B) {
            int tmp = A;
            A = B;
            B = tmp;
        }

        if (C > D) {
            int tmp = C;
            C = D;
            D = tmp;
        }

        int result = 0;

        if ((A <= C && C <= B) || (A >= C && A <= D)) {
            result = Math.max(B, D) - Math.min(A, C) + 1;
        } else {
            result = B - A + 1 + D - C + 1;
        }

        System.out.println(result);
        sc.close();
    }
}