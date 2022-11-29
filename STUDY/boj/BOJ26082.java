package boj;
import java.util.*;

public class BOJ26082 { // WARBOY

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 경쟁사 제품의 가격
        int B = sc.nextInt(); // 경쟁사 제품의 성능
        int C = sc.nextInt(); // WARBOY의 가격
        int W = B / A * C;

        System.out.println(3 * W);
        sc.close();
    }
}