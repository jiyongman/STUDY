package boj;
import java.util.*;

public class BOJ2530 { // 인공지능 시계

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 시
        int B = sc.nextInt(); // 분
        int C = sc.nextInt(); // 초
        int D = sc.nextInt(); // 요리하는 데 필요한 시간(초)

        C += D;
        B += C / 60;
        C %= 60;
        A += B / 60;
        B %= 60;
        A %= 24;

        System.out.println(A + " " + B + " " + C);
        sc.close();
    }
}