package boj;
import java.util.*;

public class BOJ5532 { // 방학 숙제

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 방학일 수
        int A = sc.nextInt(); // 국어 총 페이지 수
        int B = sc.nextInt(); // 수학 총 페이지 수
        int C = sc.nextInt(); // 하루에 풀 수 있는 국어 최대 페이지 수
        int D = sc.nextInt(); // 하루에 풀 수 있는 수학 최대 페이지 수

        if (A % C == 0) {
            A = A / C;
        } else {
            A = A / C + 1;
        }

        if (B % D == 0) {
            B = B / D;
        } else {
            B = B / D + 1;
        }

        if (A > B) {
            System.out.println(L - A);
        } else {
            System.out.println(L - B);
        }

        sc.close();
    }
}