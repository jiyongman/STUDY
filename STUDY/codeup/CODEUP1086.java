package codeup;
import java.util.*;

public class CODEUP1086 { // 그림 파일 저장용량 계산하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double w = sc.nextInt(); // 가로 해상도
        double h = sc.nextInt(); // 세로 해상도
        double b = sc.nextInt(); // 한 픽셀을 저장하기 위한 비트
        double result = w * h * b / 8 / 1024 / 1024;

        System.out.printf("%.2f MB", result);
        sc.close();
    }
}