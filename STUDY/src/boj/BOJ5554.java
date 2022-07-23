package boj;
import java.util.*;

public class BOJ5554 { // 심부름 가는 길

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 집에서 학교까지의 이동 시간(초)
        int b = sc.nextInt(); // 학교에서 PC방까지의 이동 시간(초)
        int c = sc.nextInt(); // PC방에서 학원까지의 이동 시간(초)
        int d = sc.nextInt(); // 학원에서 집까지의 이동 시간(초)
        int sum = a + b + c + d;
        int x = sum / 60; // 총 이동 시간(분)
        int y = sum % 60; // 총 이동 시간(초)

        System.out.println(x);
        System.out.println(y);
        sc.close();
    }
}