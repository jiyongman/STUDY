package codeup;
import java.util.*;

public class CODEUP1085 { // 소리 파일 저장용량 계산히기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt(); // 1초 동안 마이크로 소리강약을 체크하는 수
        double b = sc.nextInt(); // 한 번 체크한 결과를 저장하는 비트
        double c = sc.nextInt(); // 좌우 등 소리를 저장할 트 개수의 채널
        double s = sc.nextInt(); // 녹음할 시간
        double result = h * b * c * s / 8 / 1024 / 1024;

        System.out.printf("%.1f MB", result);
        sc.close();
    }
}